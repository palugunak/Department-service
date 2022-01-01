package com.dailycodebuffe.department.service;

import com.dailycodebuffe.department.entity.Department;
import com.dailycodebuffe.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceimpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {

           return departmentRepository.save(department);
    }

    public Department findDepartmentId(Long departmentID) {
        return departmentRepository.findByDepartmentId(departmentID);
    }
}

