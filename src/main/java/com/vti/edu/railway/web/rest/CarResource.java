package com.vti.edu.railway.web.rest;

import com.vti.edu.railway.domain.Car;
import com.vti.edu.railway.domain.enumeration.Make;
import com.vti.edu.railway.repository.CarRepository;
import com.vti.edu.railway.web.rest.errors.BadRequestAlertException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import tech.jhipster.web.util.HeaderUtil;
import tech.jhipster.web.util.PaginationUtil;
import tech.jhipster.web.util.ResponseUtil;

/**
 * REST controller for managing {@link Car}.
 */
@RestController
@RequestMapping("/api")
@Transactional
public class CarResource {

    private final Logger log = LoggerFactory.getLogger(CarResource.class);

    private static final String ENTITY_NAME = "car";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final CarRepository carRepository;

    public CarResource(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    /**
     * {@code POST  /car} : Create a new car.
     *
     * @param car the car to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new car, or with status {@code 400 (Bad Request)} if the car has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/car")
    public Car createCar(@RequestBody Car car) throws URISyntaxException {
        log.debug("REST request to save Car : {}", car);
        if (Car.getId() != null) {
            throw new BadRequestAlertException("A new car cannot already have an ID", ENTITY_NAME, "idexists");
        }
        Car result = carRepository.save(car);
        return result;
    }

    /**
     * {@code PUT  /car/:id} : Updates an existing car.
     *
     * @param id the id of the car to save.
     * @param car the car to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated car,
     * or with status {@code 400 (Bad Request)} if the car is not valid,
     * or with status {@code 500 (Internal Server Error)} if the car couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/car/{id}")
    public Car updateCar(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody Car car
    ) throws URISyntaxException {
        log.debug("REST request to update Car : {}, {}", id, car);
        if (car.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, car.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }
        Car result = carRepository.save(car);
        return result;
    }

    @GetMapping("/car/customAPI-1")
    public List<Car> customAPI1() {
        return carRepository.findByMakeInHondaAndToyota();
    }
    @GetMapping("/car/Top5MostExpensiveCars")
    public List<Car> Top5MostExpensiveCars() {
        return carRepository.Top5MostExpensiveCars();
    }

    @GetMapping("/car/findCarColorStartWith")
    public List<Car> findCarColorStartWith(@RequestParam(required = false) String color) {
        return carRepository.findByCarColorStartWith(color);
    }

    @GetMapping("/car/findByCarYearBetweenPrice")
    public List<Car> findByCarYearBetweenPrice() {
        return carRepository.findByCarYearBetweenPrice();
    }
        @GetMapping("/car/countTheNumberOfCars")
    public List<Car> countTheNumberOfCars() {
        return  carRepository.findByGroupByMake(); }
    @GetMapping("/car/findByOrderByYearAsc")
    public List<Car> findByOrderByYearAsc() {return  carRepository.findByMakeMakeOrderByYearAsc(); }
}
