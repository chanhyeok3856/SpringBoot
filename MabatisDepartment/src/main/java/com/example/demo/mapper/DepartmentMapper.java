package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.*;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.Department;

@Mapper
public interface DepartmentMapper {
	@Select("SELECT * FROM Department")
    @Results(id = "departmentResultMap", value = {
        @Result(property = "deptId", column = "dept_id", id = true),
        @Result(property = "deptName", column = "dept_name"),
        @Result(property = "location", column = "location")
    })
    List<Department> getAllDepartments();

    @Select("SELECT * FROM Department WHERE dept_id = #{deptId}")
    @ResultMap("departmentResultMap")
    Department getDepartmentById(int deptId);

    @Insert("INSERT INTO Department (dept_name, location) VALUES (#{deptName}, #{location})")
    void insertDepartment(Department department);

    @Update("UPDATE Department SET dept_name = #{deptName}, location = #{location} WHERE dept_id = #{deptId}")
    void updateDepartment(Department department);

    @Delete("DELETE FROM Department WHERE dept_id = #{deptId}")
    void deleteDepartment(int deptId);
}