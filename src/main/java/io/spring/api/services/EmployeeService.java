package io.spring.api.services;

import java.util.List;

import io.spring.api.models.Employee;

public interface EmployeeService {
    public List<Employee> get();
    public Employee get(Integer id);
    public Boolean save(Employee employee);
    public Boolean delete(Integer id);
}
