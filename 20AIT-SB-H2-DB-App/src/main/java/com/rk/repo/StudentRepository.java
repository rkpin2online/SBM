package com.rk.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Serializable> {

}
