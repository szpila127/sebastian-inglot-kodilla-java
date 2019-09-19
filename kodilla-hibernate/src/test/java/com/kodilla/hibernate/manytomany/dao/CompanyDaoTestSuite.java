package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
//        try {
//            companyDao.deleteById(softwareMachineId);
//            companyDao.deleteById(dataMaestersId);
//            companyDao.deleteById(greyMatterId);
//        } catch (Exception e) {
//            //do nothing
//        }
    }

    @Test
    public void testFindEmployeeByLastname() {
        //Given
        Employee tom = new Employee("Tom", "Riddle");
        Employee max = new Employee("Max", "Riddick");
        Employee frank = new Employee("Frank", "Sinatra");
        Employee seeb = new Employee("Seeb", "Stepowy");

        employeeDao.save(tom);
        employeeDao.save(max);
        employeeDao.save(frank);
        employeeDao.save(seeb);

        //When
        List<Employee> byLastName = employeeDao.retriveLastname("Riddle");

        //Then
        Assert.assertEquals(1, byLastName.size());

        //CleanUp
        employeeDao.delete(tom);
        employeeDao.delete(max);
        employeeDao.delete(frank);
        employeeDao.delete(seeb);
    }

    @Test
    public void testFindCompaniesBy3FirstLetters() {
        //When
        Company microsoft = new Company("Microsoft");
        Company kodilla = new Company("Kodilla");
        Company kodak = new Company("Kodak");
        Company mixiaomi = new Company("MiXiaomi");

        companyDao.save(microsoft);
        companyDao.save(kodilla);
        companyDao.save(kodak);
        companyDao.save(mixiaomi);

        //When
        List<Company> findBy3FirstLetters = companyDao.retrieveCompaniesWithFirst3Letters("Kod");

        //Then
        Assert.assertEquals(2, findBy3FirstLetters.size());

        //CleanUp
        companyDao.delete(microsoft);
        companyDao.delete(kodilla);
        companyDao.delete(kodak);
        companyDao.delete(mixiaomi);
    }
}