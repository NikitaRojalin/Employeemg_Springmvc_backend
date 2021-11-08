package com.example.springboot.employeedemo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springboot.employeedemo.model.Employee;
@Repository
public interface Employeerepository extends JpaRepository<Employee, Long> {

}
