package com.vti.edu.railway.repository;

import com.vti.edu.railway.domain.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Employee entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // HQL
    @Query(value = "SELECT e From Employee e WHERE e.firstName LIKE 'c%'")
    public List<Employee> findEmployeeFirstNameStartWith();

    @Query(value = "SELECT e FROM Employee e WHERE e.firstName LIKE :firstName%")
    public List<Employee> findEmployeeFirstNameStartWith(@Param("firstName") String firstName);

    // Naming Query
    public List<Employee> findByFirstNameStartingWith(String s);

    // Naming Query
    // Select * from Employee
    // where firstName = firstName
    public List<Employee> findByFirstName(String firstName);

    public List<Employee> findBySalary(Long salary);

    // Greater than / Small Less
    public List<Employee> findBySalaryGreaterThan(Long salary);

    public List<Employee> findBySalaryLessThan(Long salary);

    public List<Employee> findBySalaryBetween(Long salary1, Long salary2);
}
