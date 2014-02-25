package com.diit.complab.mvc;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by anatoliy on 26.02.14.
 */
public class EmployeeDaoImp implements EmployeeDao {

    @Autowired
    private SessionFactory sf;

    @Override
    public Employee getById(Integer id) {
        Employee employee = (Employee) sf.getCurrentSession().createQuery("from Employee e where e.id=:id").
                setInteger(id, 0);
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = sf.getCurrentSession().createQuery("from Employee e").list();
        return employees;
    }

    @Override
    public void add(Employee employee) {
        sf.getCurrentSession().save(employee);
    }
}

