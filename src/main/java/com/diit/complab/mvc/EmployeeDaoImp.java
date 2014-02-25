package com.diit.complab.mvc;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by anatoliy on 26.02.14.
 */
public class EmployeeDaoImp implements EmployeeDao {

    @Autowired
    private SessionFactory sf;

    public SessionFactory getSf() {
        return sf;
    }

    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }

    @Override
    @Transactional
    public Employee getById(Integer id) {
        Employee employee = (Employee) sf.getCurrentSession().createQuery("from Employee e where e.id=:id").
                setInteger("id", id);
        return employee;
    }

    @Override
    @Transactional
    public List<Employee> getAll() {
        List<Employee> employees = sf.getCurrentSession().createQuery("from Employee e").list();
        return employees;
    }

    @Override
    @Transactional
    public void add(Employee employee) {
        sf.getCurrentSession().save(employee);
    }
}

