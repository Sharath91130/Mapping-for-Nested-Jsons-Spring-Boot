package com.mss.fresher.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="sharath_departments")
public class Departments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private String name;
	
	
	private String building;
	
	
	@ManyToOne
	@JoinColumn(name="collageID",referencedColumnName = "id")
	private College college;
	
	
	@OneToMany(mappedBy = "departments" , cascade = CascadeType.ALL)
	private List<Professors> professors;


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


	public String getBuilding() {
		return building;
	}


	public void setBuilding(String building) {
		this.building = building;
	}


	public College getCollege() {
		return college;
	}


	public void setCollege(College college) {
		this.college = college;
	}


	public List<Professors> getProfessors() {
		return professors;
	}


	public void setProfessors(List<Professors> professors) {
		this.professors = professors;
	}
	
	

}
