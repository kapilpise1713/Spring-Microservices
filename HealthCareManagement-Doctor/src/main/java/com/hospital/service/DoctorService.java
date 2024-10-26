package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.model.Doctor;
import com.hospital.repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	public Doctor saveDoctor(Doctor doctor)
	{
		return doctorRepository.save(doctor);
	}
	
	public List<Doctor> fetchAllDoctorBySpec(String spec)
	{
		return doctorRepository.findAllDoctorBySpec(spec);
	}
	
	
	public Doctor fetchDoctor(String spec)
	{
		return doctorRepository.getDistinctDoctorBySpec(spec);
	}
	

}
