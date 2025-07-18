package com.mss.fresher.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="sharath_college")
public class College {

	@Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private String name;
	
	private String location;
	
	
	@OneToMany(mappedBy = "college" ,cascade = CascadeType.ALL)
	private List<Departments> departments;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public List<Departments> getDepartments() {
		return departments;
	}


	public void setDepartments(List<Departments> departments) {
		this.departments = departments;
	}
}
