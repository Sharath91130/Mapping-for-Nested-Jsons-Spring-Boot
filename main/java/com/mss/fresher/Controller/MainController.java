package com.mss.fresher.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mss.fresher.Entity.College;
import com.mss.fresher.Entity.Courses;
import com.mss.fresher.Entity.Departments;
import com.mss.fresher.Entity.Professors;
import com.mss.fresher.Repo.CollegeRepo;
import com.mss.fresher.Repo.CourseRepo;
import com.mss.fresher.Repo.DepartmentsRepo;
import com.mss.fresher.Repo.ProfessorRepo;

import jakarta.transaction.Transactional;

import java.util.*;

@RestController
@RequestMapping("/api")
@Transactional
public class MainController {
	
	
	private CollegeRepo collegeRepo;
	
	private DepartmentsRepo departmentsRepo;
	
	private ProfessorRepo professorRepo;
	
	
	private CourseRepo courseRepo;
	
	
	
	
	
	
	public MainController(CollegeRepo collegeRepo,DepartmentsRepo departmentsRepo, ProfessorRepo professorRepo, CourseRepo courseRepo) {
		this.collegeRepo=collegeRepo;
		this.departmentsRepo=departmentsRepo;
		this.professorRepo=professorRepo;
		this.courseRepo=courseRepo;
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody College college){
		
	
		
		
		collegeRepo.save(college);
		System.out.println(college.getName());
		
		List<Departments> departments=college.getDepartments();
		
		for(Departments d:departments) {
			System.out.println("departemnts deatils  "+d.getName() + "  " + d.getId());
			System.out.println("--------------------------------------------------");
			departmentsRepo.save(d);
			
			d.setCollege(college);
			List<Professors> professors = d.getProfessors();
			
			for(Professors p:professors) {
				System.out.println(" Professor details "+p.getName() + " " + p.getTitle());
				p.setDepartments(d);
				professorRepo.save(p);
				List<Courses> courses = p.getCourses();
				
				for(Courses c:courses) {
					c.setProfessors(p);
					System.out.println("Coursess Deatils "+c.getCode() + " " + c.getTitle() + " "+c.getCredits());
					System.out.println("--------------------------------------------------");
					
					courseRepo.save(c);
				}
			}
		}
		
		
		
		return ResponseEntity.ok("sucess");
	}

}
