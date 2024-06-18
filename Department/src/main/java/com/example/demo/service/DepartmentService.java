package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {
@Autowired
private DepartmentRepository departmentRepository;

public Department saveDepartment(Department department) {
	return departmentRepository.save(department);
}
public List<Department> getAllDepartments(){
	return departmentRepository.findAll();
}
public Optional<Department> getDepartmentById(Long id){
	return departmentRepository.findById(id);
}
public void deleteDepartment(Long id) {
	departmentRepository.deleteById(id);
}
}
