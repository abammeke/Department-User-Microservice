package com.webnet;

import com.webnet.entity.Department;
import com.webnet.repository.DepartmentRepository;
import com.webnet.service.DepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentServiceApplicationTests {

    @MockBean
    public DepartmentRepository departmentRepositoryMock;

    @Autowired
    public DepartmentService departmentServiceMock;


    @Test
    public void saveUserTest(){
        Department department = new Department(454L, "d", "d", "909");
        when(departmentRepositoryMock.save(
                department)).thenReturn(department);

        Department d= departmentServiceMock.saveDepartment(department);
        assertEquals(22L, d.getDepartmentId());
    }
}
