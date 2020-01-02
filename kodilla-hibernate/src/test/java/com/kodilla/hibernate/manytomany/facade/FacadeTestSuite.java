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
        Company microsoft = new Company("Microsoft");
        Company kodilla = new Company("Kodilla");
        Company kodak = new Company("Kodak");
        Company mixiaomi = new Company("MiXiaomi");
        facade.saveCompany(microsoft);
        facade.saveCompany(kodilla);
        facade.saveCompany(kodak);
        facade.saveCompany(mixiaomi);
        //When
        List<Company> companies = facade.findCompanyByAnyString("kod");
        System.out.println(companies);
        int size = companies.size();
        //Then
        assertEquals(2, size);
        //CleanUp
        facade.removeCompany(microsoft);
        facade.removeCompany(kodilla);
        facade.removeCompany(kodak);
        facade.removeCompany(mixiaomi);
    }

    @Test
    public void testGetEmployeesByAnyLetters() {
        //Given
        Employee tom = new Employee("Tom", "Riddle");
        Employee max = new Employee("Max", "Riddick");
        Employee frank = new Employee("Frank", "Sinatra");
        Employee seeb = new Employee("Seeb", "Stepowy");
        facade.saveEmployee(tom);
        facade.saveEmployee(max);
        facade.saveEmployee(frank);
        facade.saveEmployee(seeb);
        //When
        List<Employee> employees = facade.findEmployeeByAnyString("dd");
        System.out.println(employees);
        int size = employees.size();
        //Then
        assertEquals(2, size);
        //CleanUp
        facade.removeEmployee(tom);
        facade.removeEmployee(max);
        facade.removeEmployee(frank);
        facade.removeEmployee(seeb);
    }
}