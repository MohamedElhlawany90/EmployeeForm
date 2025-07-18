package com.global;

import com.global.Exceptions.ResourceNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/{id}")
    public ResponseEntity<Employee> findEmpById(@PathVariable Long id) {
        Employee employee = empService.findEmpById(id);
        if (employee == null) {
            throw new ResourceNotFoundException("Employee not found with id: " + id);
        }
        return ResponseEntity.ok(employee);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> findAllEmps() {
        return ResponseEntity.ok(empService.findAllEmps());
    }

    @PostMapping
    public ResponseEntity<Employee> addEmp(@Valid @RequestBody Employee employee) {
        Employee savedEmployee = empService.addEmp(employee);
        return ResponseEntity.ok(savedEmployee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmp(@PathVariable Long id, @Valid @RequestBody Employee updatedEmp) {
        Employee updated = empService.updateEmp(id, updatedEmp);
        if (updated == null) {
            throw new ResourceNotFoundException("Cannot update. Employee not found with id: " + id);
        }
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmp(@PathVariable Long id) {
        empService.deleteEmp(id);
        return ResponseEntity.ok("Employee deleted successfully.");
    }
}
