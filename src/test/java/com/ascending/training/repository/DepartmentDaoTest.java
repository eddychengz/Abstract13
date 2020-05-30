package com.ascending.training.repository;

import com.ascending.training.model.Department;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DepartmentDaoTest {
    @Test
    public void getDepartmentsTest(){
        DepartmentDao countryJDBCDao = new DepartmentDao();
        List<Department> departmentList = countryJDBCDao.getDepartments();
        assertEquals(4,departmentList.size());
//        countryJDBCDao.getCountrys().size()==4;
    }
}

