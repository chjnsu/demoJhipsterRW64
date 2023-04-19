package com.vti.edu.railway.repository;

import com.vti.edu.railway.domain.Employee;
import com.vti.edu.railway.service.dto.EmployeeDTO;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data JPA repository for the Employee entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query (value = "select e.lastName,j.jobTitle, e.salary  from Employee e\n" +
        "join Job j on e.id=j.employee.id\n" +
        "where salary = (select max(salary) from (select salary from Employee) abc)" )
    public List<Employee> findEmployeeSearchStartWith();

    @Query (value = "SELECT e FROM Employee e \n" +
        "WHERE department.id in (1,9) " )
    public List<Employee> findEmployeeSearchIdStartWith();


}
