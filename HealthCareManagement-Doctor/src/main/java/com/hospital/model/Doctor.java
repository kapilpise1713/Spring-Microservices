package com.hospital.model;

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


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "Doctor_Table")
public class Doctor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long doctorId;
	@Column(name = "Doctor_Name")
	private String doctorName;
	@Column(name = "Doctor_Specialization")
	private String doctorSpec;
	@Column(name = "Doctor_MobileNo")
	private long doctorMobileNo;
	@Column(name = "Doctor_Experience")
	private int doctorExp;
	

}
