package com.bank.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Customer implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//	@Id
//	@SequenceGenerator(name="candidateSequence", sequenceName="candidatId_seq")
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="candidateSequence")
	private int candidateId;
	
//	@Column(name = "prefix")
	private String prefix;
	
//	@Column(name = "firstName")
	private String firstName;

//	@Column(name = "middleName")
	private String middleName;
	
//	@Column(name = "lastName")
	private String lastName;
	
//	@Column(name = "phoneNumber")
	private String phoneNumber;
	
//	@Column(name = "emailAddress")
	private String emailAddress;

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
}
