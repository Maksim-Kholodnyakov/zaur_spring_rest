package com.maksprofff.spring.rest.dao;

import com.maksprofff.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

   public void saveEmployee(Employee employee);

   public Employee getEmployee(int id);

   public void deleteEmployee(int id);
}
