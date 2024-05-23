package com.ems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
