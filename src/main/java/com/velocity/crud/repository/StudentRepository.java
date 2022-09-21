package com.velocity.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.crud.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
