package com.hospital.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hospital.model.Doctor;
import com.hospital.model.Patient;
import com.hospital.service.PatientService;


@RestController
public class PatientController 
{
	@Autowired
	private PatientService patientService;
	@Autowired
	private DiscoveryClient client; 
	
	@PostMapping("/registerPatient/{spec}")
	public Patient registerPatient(@RequestBody Patient patient, @PathVariable String spec)
	{
		List<ServiceInstance> services = client.getInstances("HealthCareManagement-Doctor"); //kl
		ServiceInstance serviceInstance = services.get(0);
		URI uri = serviceInstance.getUri();
		System.out.println(uri.toString()); // localhost:4408
		
		// /fetchdoctor/{spec}
		
		Doctor doctor = new RestTemplate().getForObject(uri+"/fetchdoctor/"+spec, Doctor.class);
		
		String docname = doctor.getDoctorName();
		String docspec = doctor.getDoctorSpec();
		int docexp = doctor.getDoctorExp();
		
		patient.setDoctorName(docname);
		patient.setDoctorSpec(docspec);
		patient.setDoctorExp(docexp);
		
		
		
		return patientService.registerPatient(patient);
	}
	
	

}
