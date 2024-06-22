package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.model.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAllDepartments() {
        return departmentMapper.getAllDepartments();
    }

    @Override
    public Department getDepartmentById(int deptId) {
        return departmentMapper.getDepartmentById(deptId);
    }

    @Override
    public void insertDepartment(Department department) {
        departmentMapper.insertDepartment(department);
    }

    @Override
    public void updateDepartment(Department department) {
        departmentMapper.updateDepartment(department);
    }

    @Override
    public void deleteDepartment(int deptId) {
        departmentMapper.deleteDepartment(deptId);
    }
}