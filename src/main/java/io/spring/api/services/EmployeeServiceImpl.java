package io.spring.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.api.models.Employee;
import io.spring.api.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    private EmployeeRepository empRepository;

    @Autowired
    public EmployeeServiceImpl (EmployeeRepository emRepository){
        this.empRepository = empRepository;
    }

    @Override
    public List<Employee> get() {
        return empRepository.findAll();
    }

    @Override
    public Employee get(Integer id) {
        return empRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Region tidak ditemukan"));
    }

    @Override
    public Boolean save(Employee employee) {
        empRepository.save(employee);
        return empRepository.findById(employee.getId()).isPresent();
    }
    
    @Override
    public Boolean delete(Integer id) {
        empRepository.deleteById(id);
        return !empRepository.findById(id).isPresent();
    
    }
}
