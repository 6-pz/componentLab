package com.diit.complab.mvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by anatoliy on 26.02.14.
 */
public class EmployeeDaoStub implements EmployeeDao {

    private Map<Integer, Employee> map;

    public EmployeeDaoStub() {
        map = new HashMap<Integer, Employee>();
        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            employee.setEmail("v@pupkin" + i + ".com");
            employee.setFirstName("Vasya" + i);
            employee.setId((long) i);
            employee.setLastName("Pupkin" + i);
            map.put(i,employee);
        }
    }

    @Override
    public Employee getById(Integer id) {
        return map.get(id);
    }

    @Override
    public List<Employee> getAll() {
        return new ArrayList<Employee>(map.values());
    }

    @Override
    public void add(Employee employee) {

    }
}
