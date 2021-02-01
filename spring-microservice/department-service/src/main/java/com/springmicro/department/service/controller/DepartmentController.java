package com.springmicro.department.service.controller;

import com.springmicro.department.service.entity.Department;
import com.springmicro.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService deptService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("inside saveDepartment method of DepartmentController");
        return deptService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable("id") Long deptId) {
        return deptService.getDepartment(deptId);
    }
}
