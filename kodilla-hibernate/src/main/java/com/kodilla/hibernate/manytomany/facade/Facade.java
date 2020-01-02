package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findCompanyByAnyString(String companyName) {
        return companyDao.retrieveCompaniesWithAnyLetters(companyName);
    }

    public List<Employee> findEmployeeByAnyString(String employeeName) {
        return employeeDao.retrieveEmployeWithAnyLetters(employeeName);
    }

    public void saveEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    public void saveCompany(Company company) {
        companyDao.save(company);
    }

    public void removeEmployee(Employee employee) {
        employeeDao.delete(employee);
    }

    public void removeCompany(Company company) {
        companyDao.delete(company);
    }

    public CompanyDao getCompanyDao() {
        return companyDao;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }
}
