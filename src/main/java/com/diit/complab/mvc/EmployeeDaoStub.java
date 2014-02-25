package com.diit.complab.mvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anatoliy on 26.02.14.
 */
public class EmployeeDaoStub implements EmployeeDao {
    @Override
    public Employee getById(Integer id) {
        return null;
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> list = new ArrayList<Employee>();

        for (int i = 0; i < 10; i++){
            Employee employee = new Employee();
            employee.setEmail("v@pupkin" + i + ".com");
            employee.setFirstName("Vasya" + i);
            employee.setId((long)i);
            employee.setLastName("Pupkin" + i);
            list.add(employee);
        }
        return list;
    }

    @Override
    public void add(Employee employee) {

    }
}
