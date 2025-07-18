package com.global;

import com.global.Exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepository empRepository;

    public Employee findEmpById(Long id) {
        return empRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));
    }

    public List<Employee> findAllEmps() {
        return empRepository.findAll();
    }

    public Employee addEmp(Employee employee) {
        return empRepository.save(employee);
    }

    public Employee updateEmp(Long id, Employee updatedEmp) {
        Employee existingEmp = empRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));

        updatedEmp.setId(existingEmp.getId());
        return empRepository.save(updatedEmp);
    }

    public void deleteEmp(Long id) {
        Employee existingEmp = empRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));

        empRepository.delete(existingEmp);
    }
}
