package com.webnet.controller;

import com.webnet.entity.Department;
import com.webnet.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody  Department department)
    {
        log.info("inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("inside find department by Id: {} of DepartmentController ", departmentId);
        return departmentService.findDepartmentById(departmentId);
    }

}
