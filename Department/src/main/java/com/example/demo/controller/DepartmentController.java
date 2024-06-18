package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@Controller
@RequestMapping("/departments")
public class DepartmentController {
@Autowired
private DepartmentService departmentService;

@GetMapping
public String listDepartments(Model model) {
	model.addAttribute("departments", departmentService.getAllDepartments());
	return "department/list";
}
@GetMapping("/{id}")
public String viewDepartment(@PathVariable Long id, Model model) {
	Optional<Department> department = departmentService.getDepartmentById(id);
	department.ifPresent(value -> model.addAttribute("department", value));
	return "department/view";
}
@GetMapping("/create")
public String createDepartmentForm(Model model) {
	model.addAttribute("department", new Department());
	return "department/create";
}
@PostMapping("/create")
public String createDepartment(@ModelAttribute Department department) {
	departmentService.saveDepartment(department);
	return "redirect:/departments";
}
@GetMapping("/edit/{id}")
public String editDepartmentForm(@PathVariable Long id, Model model) {
	Optional<Department> department = departmentService.getDepartmentById(id);
	department.ifPresent(value -> model.addAttribute("department", value));
	return "department/edit";
}
@PostMapping("/edit/{id}")
public String editDepartment(@PathVariable Long id, @ModelAttribute Department department) {
	department.setId(id);
	departmentService.saveDepartment(department);
	return "redirect:/departments";
}
@GetMapping("/delete/{id}")
public String deleteDepartment(@PathVariable Long id) {
	departmentService.deleteDepartment(id);
	return "redirect:/departments";
}
}
