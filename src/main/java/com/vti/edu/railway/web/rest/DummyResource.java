package com.vti.edu.railway.web.rest;

import com.vti.edu.railway.domain.Dummy;
import com.vti.edu.railway.repository.DummyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DummyResource {

    private final DummyRepository dummyRepository;

    public DummyResource(DummyRepository dummyRepository) {
        this.dummyRepository = dummyRepository;
    }

    // Get all: chua chuan      Get = Lay du lieu
    @GetMapping("/dummy/getAll")
    public List<Dummy> getAllDummy(){
        return dummyRepository.findAll();
    }

    // Pram
    @GetMapping("/dummy/byId")
    public Optional<Dummy> getByIdPram(@RequestParam Long id){
        System.out.println("Nhan dc: " + id);
        return dummyRepository.findById(id);
    }

    // Get tung doi tuong
    @GetMapping("/dummy/{id}")
    public Optional<Dummy> getById(@PathVariable Long id){
        System.out.println("Nhan dc: " + id);
        return dummyRepository.findById(id);
    }

    // Them moi: POST
    @PostMapping("/dummy")
    public Dummy createOne(@RequestBody Dummy dummy){
        System.out.println("Nhan dc: " + dummy);
        dummy.setId(null);
        return dummyRepository.save(dummy);
    }

    // Them moi: PUT
    @PutMapping("/dummy")
    public Dummy editOne(@RequestBody Dummy dummy){
        System.out.println("Nhan dc: " + dummy);
        return dummyRepository.save(dummy);
    }


    @DeleteMapping("/dummy/{id}")
    public void deleteOne(@PathVariable Long id){
        System.out.println("Nhan dc: " + id);
        dummyRepository.deleteById(id);
    }

}
