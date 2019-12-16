package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private Facade facade;

    @Test
    public void testGetCompanyByAnyLetters() {
        List<Company> companies = facade.findCompanyByAnyString("tt");
        System.out.println(companies);
    }

    @Test
    public void testGetEmployeesByAnyLetters() {
        List<Employee> employees = facade.findEmployeeByAnyString("on");
        System.out.println(employees);
    }
}