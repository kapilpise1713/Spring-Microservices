package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.Doctor;
import com.hospital.service.DoctorService;

@RestController
public class DoctorController 
{
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/savedoctor")
	public Doctor saveDoctor(@RequestBody Doctor doctor) //Json to Java Object
	{
		return doctorService.saveDoctor(doctor);
	}
	
	@GetMapping("/fetchdoctor/{spec}")
	public Doctor fetchDoctor(@PathVariable String spec) {
		return doctorService.fetchDoctor(spec);
	}

}
