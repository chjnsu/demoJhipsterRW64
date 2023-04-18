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

    @GetMapping("/dummy/getAll")
    public List<Dummy> getAllDummy(){
        return dummyRepository.findAll();
    }

    //Get từng đối tượng
    @GetMapping("/dummy/{id}")
    public Optional<Dummy>getDummyById(@PathVariable Long id){
        System.out.println("id:"+ id);
        return dummyRepository.findById(1L);
    }

    @PostMapping("/dummy")
    public Dummy createDummy(@RequestBody Dummy dummy){
        System.out.println("dummy:" + dummy);
        dummy.setId(null);
        return dummyRepository.save(dummy);
    }



}
