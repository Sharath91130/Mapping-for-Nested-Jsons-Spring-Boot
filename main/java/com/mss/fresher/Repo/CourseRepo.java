package com.mss.fresher.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.fresher.Entity.Courses;
@Repository
public interface CourseRepo extends JpaRepository<Courses, Integer>{

}
