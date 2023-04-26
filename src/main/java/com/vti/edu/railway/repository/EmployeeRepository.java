package com.vti.edu.railway.repository;

import com.vti.edu.railway.domain.Department;
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

    @Query("Select e from Employee e " + "where e.salary = :salary")
    public List<Employee> findBySalary(@Param("salary") Long salary);

    // Greater than / Small Less
    //    @Query("Select e from Employee e " +
    //        "where e.salary > :salary" +
    //        "And e.commission > :commission")
    public List<Employee> findBySalaryGreaterThanAndCommissionPctGreaterThan(Long salary, Long commissionPct);

    //    @Query("Select e from Employee e " +
    //        "where e.salary > :salary" +
    //        "or e.commission > :commission")
    public List<Employee> findBySalaryGreaterThanOrCommissionPctGreaterThan(Long salary, Long commissionPct);

    public List<Employee> findBySalaryLessThan(Long salary);

    @Query("")
    public List<Employee> findBySalaryBetween(Long salary1, Long salary2);

    // Virtual
    // NamingQuery
    // select * from Employee e where department = :department

    public List<Employee> findByDepartment(Department department);

    public List<Employee> findByDepartment_departmentNameOrderBySalaryAsc(String department);

    public List<Employee> findByDepartmentDepartmentNameOrderBySalaryDesc(String department);
}
