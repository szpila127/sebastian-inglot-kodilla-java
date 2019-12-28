package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private Facade facade;

    @Test
    public void testGetCompanyByAnyLetters() {
        //Given
        //When
        List<Company> companies = facade.findCompanyByAnyString("tt");
        System.out.println(companies);
        int size = companies.size();
        //Then
        assertEquals(1, size);
    }

    @Test
    public void testGetEmployeesByAnyLetters() {
        //Given
        //When
        List<Employee> employees = facade.findEmployeeByAnyString("on");
        System.out.println(employees);
        int size = employees.size();
        //Then
        assertEquals(1, size);
    }
}