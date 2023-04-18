package com.vti.edu.railway.web.rest.vm;

import com.vti.edu.railway.domain.Department;
import com.vti.edu.railway.repository.DepartmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentResource {
    private final DepartmentRepository departmentRepository;

    public DepartmentResource(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    
    //Get All Department
    @GetMapping
    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }

    //Get Department By Id
    @GetMapping(value = "/{id}")
    public Optional<Department> getDepartmentById(@PathVariable Long id){
        return departmentRepository.findById(1L);
    }

    //Creat New Department

    @PostMapping
    public Department createDepartment(@RequestBody Department department){
        department.setId(null);
        return departmentRepository.save(department);
    }

    //Update Department
    @PutMapping(value = "/{id}")
    public void updateDepartment (@PathVariable Long id, @RequestBody Department department){
        department.setId(id);
        departmentRepository.save(department);
    }

    //Delete Department
    @DeleteMapping(value = "/{id}")
    public void deleteDepartment(@PathVariable Long id){
        departmentRepository.deleteById(id);
    }




}
