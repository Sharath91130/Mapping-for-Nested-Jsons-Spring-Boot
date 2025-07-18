package com.mss.fresher.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.fresher.Entity.College;
@Repository
public interface CollegeRepo extends JpaRepository<College, Integer>{

}
