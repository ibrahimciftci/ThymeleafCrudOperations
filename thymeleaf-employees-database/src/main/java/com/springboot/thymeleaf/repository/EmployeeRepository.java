package com.springboot.thymeleaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.thymeleaf.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
