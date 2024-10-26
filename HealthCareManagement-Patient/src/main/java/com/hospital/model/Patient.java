package com.hospital.model;

import java.util.function.LongToDoubleFunction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


@Entity
@Table(name = "Patient_Table")
public class Patient 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long patientId;
	@Column(name = "Patient_Name")
	private String patientName;
	@Column(name = "Health_Issue")
	private String healthIssue;
	@Column(name = "Patient_Age")
	private int patientAge;
	@Column(name = "Doctor_Name")
	private String doctorName;
	@Column(name = "Doctor_Specialization")
	private String doctorSpec;
	@Column(name = "Doctor_Experience")
	private int doctorExp;
	

}
