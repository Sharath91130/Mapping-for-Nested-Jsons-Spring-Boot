package com.mss.fresher.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name="sharath_courses")
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private String title;
	
	
	private String code;
	
	
	private Integer credits;
	
	
	@ManyToOne
	@JoinColumn(name="professor_id", referencedColumnName = "id")
	private Professors professors;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public Integer getCredits() {
		return credits;
	}


	public void setCredits(Integer credits) {
		this.credits = credits;
	}


	public Professors getProfessors() {
		return professors;
	}


	public void setProfessors(Professors professors) {
		this.professors = professors;
	}
	
	
	
}
