package com.vti.edu.railway.web.rest.vm;

import com.vti.edu.railway.domain.Department;
import com.vti.edu.railway.domain.Employee;
import com.vti.edu.railway.repository.DepartmentRepository;
import com.vti.edu.railway.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeResource {
    private final EmployeeRepository employeeRepository;

    public EmployeeResource(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //Get All Employee
    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    //Get Employee By Id
    @GetMapping(value = "/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeRepository.findById(1L);
    }

    //Creat New Employee

    @PostMapping
    public Employee createDepartment(@RequestBody Employee employee){
        employee.setId(null);
        return employeeRepository.save(employee);
    }

    //Update Employee
    @PutMapping(value = "/{id}")
    public void updateEmployee (@PathVariable Long id, @RequestBody Employee employee){
        employee.setId(id);
        employeeRepository.save(employee);
    }

    //Delete Employee
    @DeleteMapping(value = "/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeRepository.deleteById(id);
    }




}
