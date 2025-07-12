package com.praccrud.EmpTrack.repository;

import com.praccrud.EmpTrack.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}