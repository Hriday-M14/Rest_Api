package com.hridaymehra.restservice.dao;

import com.hridaymehra.restservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}