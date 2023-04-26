package com.vti.edu.railway.repository;

import com.vti.edu.railway.domain.Authority;
import com.vti.edu.railway.domain.Car;

import com.vti.edu.railway.service.dto.CarDTO;
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

    @Query(value = "SELECT * FROM Car c ORDER BY c.price DESC LIMIT 5", nativeQuery = true)
      public List<Car> Top5MostExpensiveCars();


    @Query(value = "SELECT c FROM Car c WHERE c.color = :mau And isAvailable = '1'")
    public List<Car> findByCarColorStartWith(@Param("mau") String mau);
    @Query (value = "SELECT c FROM Car c \n" +
        "WHERE c.year > 2017 AND c.price BETWEEN 15000 AND 22000\n" )
    public List<Car> findByCarYearBetweenPrice();
    @Query (value = "SELECT New com.vti.edu.railway.service.dto.CarDTO( c.make, count(model) AS SLxe ) FROM Car c  \n" +
        "GROUP BY c.make" )
    public List<CarDTO> findByGroupByMake();
    @Query (value = "SELECT c FROM Car c \n" +
        "ORDER BY c.year Asc" )
    public List<Car> findByMakeMakeOrderByYearAsc();

    @Query (value = "SELECT c FROM Car c WHERE c.color = :color AND isAvailable = '1' ORDER BY c.price DESC" )
    public List<Car> findByCarColorOrderByPriceDESC(@Param("color") String color);
}
