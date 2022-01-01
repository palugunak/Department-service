package com.dailycodebuffe.department.controller;

import com.dailycodebuffe.department.entity.Department;
import com.dailycodebuffe.department.service.DepartmentService;
import com.dailycodebuffe.department.service.DepartmentServiceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
    //    log.info("Insdie the Department method of department controller");

        return departmentService.saveDepartment(department);

    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id")  Long departmentID){
        return  departmentService.findDepartmentId(departmentID);
    }

}
