package com.vti.edu.railway.repository;

import com.vti.edu.railway.domain.Department;
import com.vti.edu.railway.service.dto.DepartmentPlusDTO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Department entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Query(
        nativeQuery = false,
        value = "SELECT new com.vti.edu.railway.service.dto.DepartmentPlusDTO( d.id, d.departmentName as departmentName, concat(l.city, ' - ', c.countryName,r.regionName) as address) FROM Department d\n" +
        "LEFT JOIN Location l ON d.location.id = l.id\n" +
        "LEFT JOIN Country c ON l.country.id = c.id\n" +
        "LEFT JOIN Region r ON c.region.id = r.id"
    )
    List<DepartmentPlusDTO> findAllDepartmentWithLocationDetail(); // Xong cau lejenh truy van SQL
}
