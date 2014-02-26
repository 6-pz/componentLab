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
    private SessionFactory sessionFactory;

    public SessionFactory getSf() {
        return sessionFactory;
    }

    public void setSf(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    @Transactional
    public Employee getById(Integer id) {
        
        Employee employee = (Employee) sessionFactory.getCurrentSession().createQuery("from Employee e where e.id=:id").
                setInteger("id", id).uniqueResult();
        return employee;
    }

    @Override
    @Transactional
    public List<Employee> getAll() {
        List<Employee> employees = sessionFactory.getCurrentSession().createQuery("from Employee e").list();
        return employees;
    }

    @Override
    @Transactional
    public void add(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }
}

