package com.hospital.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString



public class Doctor 
{
	private Long doctorId;
	private String doctorName;
	private String doctorSpec;
	private long doctorMobileNo;
	private int doctorExp;

}
