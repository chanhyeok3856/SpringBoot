package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Department;

public interface DepartmentService {
	 List<Department> getAllDepartments();
	    Department getDepartmentById(int deptId);
	    void insertDepartment(Department department);
	    void updateDepartment(Department department);
	    void deleteDepartment(int deptId);
	}