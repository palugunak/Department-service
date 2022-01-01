package com.dailycodebuffe.department.service;

import com.dailycodebuffe.department.entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Department findDepartmentId(Long departmentID);

}
