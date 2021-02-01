package com.springmicro.department.service.service;

import com.springmicro.department.service.entity.Department;
import com.springmicro.department.service.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository deptRepository;

    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment of DepartmentService");
        return deptRepository.save(department);
    }

    public Department getDepartment(Long deptId) {
        return deptRepository.findById(deptId).get();
    }
}
