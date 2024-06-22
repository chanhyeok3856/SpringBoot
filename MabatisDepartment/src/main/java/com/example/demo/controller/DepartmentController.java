package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/{deptId}")
    public Department getDepartmentById(@PathVariable int deptId) {
        return departmentService.getDepartmentById(deptId);
    }

    @PostMapping
    public void insertDepartment(@RequestBody Department department) {
        departmentService.insertDepartment(department);
    }

    @PutMapping("/{deptId}")
    public void updateDepartment(@PathVariable int deptId, @RequestBody Department department) {
        department.setDeptId(deptId);
        departmentService.updateDepartment(department);
    }

    @DeleteMapping("/{deptId}")
    public void deleteDepartment(@PathVariable int deptId) {
        departmentService.deleteDepartment(deptId);
    }
}