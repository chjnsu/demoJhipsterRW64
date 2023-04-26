package com.vti.edu.railway.web.rest;

import com.vti.edu.railway.domain.Car;
import com.vti.edu.railway.domain.Employee;
import com.vti.edu.railway.repository.CarRepository;
import com.vti.edu.railway.web.rest.errors.BadRequestAlertException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for managing {@link Employee}.
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

    @PostMapping("/cars")
    public Car createCar(@RequestBody Car car) throws URISyntaxException {
        log.debug("REST request to save Employee : {}", car);
        if (car.getId() != null) {
            throw new BadRequestAlertException("A new car cannot already have an ID", ENTITY_NAME, "idexists");
        }
        Car result = carRepository.save(car);
        return result;
    }

    @PutMapping("/cars/{id}")
    public Car updateEmployee(@PathVariable(value = "id", required = false) final Long id, @RequestBody Car car) throws URISyntaxException {
        log.debug("REST request to update Employee : {}, {}", id, car);
        if (car.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, car.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        Car result = carRepository.save(car);
        return result;
    }

    @GetMapping("/cars")
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    @GetMapping("/cars/{id}")
    public Optional<Car> findOne(@PathVariable Long id) {
        return carRepository.findById(id);
    }

    @DeleteMapping("/cars/{id}")
    public void deleteById(@PathVariable Long id) {
        carRepository.deleteById(id);
    }
}
