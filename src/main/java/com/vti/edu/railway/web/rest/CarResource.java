package com.vti.edu.railway.web.rest;
import com.vti.edu.railway.domain.Car;
import com.vti.edu.railway.repository.CarRepository;
import com.vti.edu.railway.service.dto.CarDTO;
import com.vti.edu.railway.web.rest.errors.BadRequestAlertException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
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

    @PostMapping("/car")
    public Car createEmployee(@RequestBody Car car) throws URISyntaxException {
        log.debug("REST request to save car : {}", car);
        if (car.getId() != null) {
            throw new BadRequestAlertException("A new car cannot already have an ID", ENTITY_NAME, "idexists");
        }
        Car result = carRepository.save(car);
        return result;
    }

    @PutMapping("/car/{id}")
    public Car updateCar(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody Car car
    ) throws URISyntaxException {
        log.debug("REST request to update car : {}, {}", id, car);
        if (car.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, car.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }


        Car result = carRepository.save(car);
        return result;
    }

    @GetMapping("/car")
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    @GetMapping("/car/{id}")
    public Optional<Car> findOne(@PathVariable Long id) {
        return carRepository.findById(id);
    }

    @DeleteMapping("/car/{id}")
    public void deleteById(@PathVariable Long id) {
        carRepository.findById(id);
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
    public List<CarDTO> countTheNumberOfCars() {
        return carRepository.findByGroupByMake();
    }

    @GetMapping("/car/findByOrderByYearAsc")
    public List<Car> findByOrderByYearAsc() {
        return carRepository.findByMakeMakeOrderByYearAsc();
    }

    @GetMapping("/car/findByCarColorOrderByPriceDESC")
    public List<Car> findByCarColorOrderByPriceDESC(@RequestParam(required = false) String color) {
        return carRepository.findByCarColorOrderByPriceDESC(color);
    }
}

