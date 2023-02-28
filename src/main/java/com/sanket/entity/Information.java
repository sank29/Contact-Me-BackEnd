package com.sanket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Information {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer infoId;
	
	private String name;
	
	private String email;

	private String project;
	
	private String message;
	
	

	public Information() {
		super();
	}



	public Information(Integer infoId, String name, String email, String project, String message) {
		super();
		this.infoId = infoId;
		this.name = name;
		this.email = email;
		this.project = project;
		this.message = message;
	}



	public Integer getInfoId() {
		return infoId;
	}



	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getProject() {
		return project;
	}



	public void setProject(String project) {
		this.project = project;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public String toString() {
		return "Information [infoId=" + infoId + ", name=" + name + ", email=" + email + ", project=" + project
				+ ", message=" + message + "]";
	}
	
	
	
	

}
