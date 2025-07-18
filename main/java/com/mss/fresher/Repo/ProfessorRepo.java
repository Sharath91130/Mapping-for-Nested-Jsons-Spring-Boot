package com.mss.fresher.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.fresher.Entity.Professors;
@Repository
public interface ProfessorRepo extends JpaRepository<Professors, Integer>{

}
