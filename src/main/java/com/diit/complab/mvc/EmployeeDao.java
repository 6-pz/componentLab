package com.diit.complab.mvc;

import java.util.List;


public interface EmployeeDao {
    public Employee getById(Integer id);
    public List<Employee> getAll();
    public void add(Employee employee);
}
