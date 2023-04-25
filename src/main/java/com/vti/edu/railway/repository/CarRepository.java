package com.vti.edu.railway.repository;

import com.vti.edu.railway.domain.Authority;
import com.vti.edu.railway.domain.Car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface CarRepository extends JpaRepository<Car, Long> {
    @Query (value = "SELECT c FROM Car c \n" +
        "WHERE make in ('Honda','Toyota') " )
    public List<Car> findByMakeInHondaAndToyota();

//    @Query(value = "SELECT c.model, c.price FROM Car c \n" +
//        "ORDER BY c.price DESC \n" +
//        "LIMIT '5' ")
//
//    }

    @Query(value = "SELECT c FROM Car c WHERE c.color = :color And isAvailable = '1'")
    public List<Car> findByCarColorStartWith(@Param("color") String color);
    @Query (value = "SELECT c FROM Car c \n" +
        "WHERE c.year > 2017 AND c.price BETWEEN 15000 AND 22000\n" )
    public List<Car> findByCarYearBetweenPrice();
//    @Query (value = "SELECT make, count(model) AS SLxe FROM Car  \n" +
//        "GROUP BY make" )
//    public List<Car> findByGroupByMake();
    @Query (value = "SELECT c.year, c.make, c.model, c.price FROM Car c \n" +
        "ORDER BY c.year Asc" )
    public List<Car> findByMakeMakeOrderByYearAsc();
}
