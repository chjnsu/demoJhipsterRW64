package com.vti.edu.railway.repository;

import com.vti.edu.railway.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data JPA repository for the Car entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query(value = " SELECT * FROM Car WHERE make IN ('Honda', 'Toyota'); ")
    public List<Car> findByMakeInHondaAndToyota();

    @Query(value = " SELECT * FROM Car ORDER BY price DESC LIMIT 5; ")
    public List<Car> Top5MostExpensiveCars();

    @Query(" SELECT * FROM Car WHERE color = '[Blue]' AND is_available = TRUE; ")
    public List<Car> findByCarColorStartWith(@Param("color") String color);

    // Greater than / Small Less
    @Query(" SELECT * FROM Car WHERE year > 2017 AND price BETWEEN 15000 AND 22000; ")
    public List<Car> findByCarYearBetweenPrice();

    @Query(" SELECT make, COUNT(DISTINCT model) as num_models FROM Car GROUP BY make; ")
    public List<Car> findByGroupByMake();

    @Query(" SELECT year, make, model, price FROM Car ORDER BY year, make, price; ")
    public List<Car> findByMakeMakeOrderByYearAsc();

}
