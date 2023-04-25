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
    @Query(value = "SELECT e FROM Employee e WHERE e.firstName= :firstName" )
    public List<Employee> findByFirstName(@Param("firstName")String firstName);
    @Query("Select e from Employee e " +
        "where e.salary = :salary")
    public List<Employee> findBySalary(@Param("salary") Long salary);


    // Greater than / Small Less
    @Query("Select e from Employee e " +
        "where e.salary > :salary")
    public List<Employee> findBySalaryGreaterThan(@Param("salary") Long salary);
    @Query("Select e from Employee e " +
        "where e.salary < :salary")
    public List<Employee> findBySalaryLessThan(@Param("salary") Long salary);

    @Query("Select e from Employee e " +
        "where e.salary BETWEEN :salary1 AND :salary2")
    public List<Employee> findBySalaryBetween(@Param("salary1") Long salary1,@Param("salary2")  Long salary2);
    public List<Employee> findByDepartment_departmentNameOrderBySalaryAsc(String department);
    public List<Employee> findByDepartmentDepartmentNameOrderBySalaryDesc(String department);

}
