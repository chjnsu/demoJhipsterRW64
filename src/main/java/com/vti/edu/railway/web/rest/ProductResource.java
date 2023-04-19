package com.vti.edu.railway.web.rest;


import com.vti.edu.railway.domain.Dummy;
import com.vti.edu.railway.domain.Product;
import com.vti.edu.railway.repository.DummyRepository;
import com.vti.edu.railway.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductResource {

//    @GetMapping("/activate")
//    public void activateAccount(@RequestParam(value = "key") String key) {
//        Optional<User> user = userService.activateRegistration(key);
//        if (!user.isPresent()) {
//            throw new AccountResource.AccountResourceException("No user was found for this activation key");
//        }
//    }

    private final ProductRepository productRepository;

    public ProductResource(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Get all: chua chuan      Get = Lay du lieu
    @GetMapping("/product/getAll")
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    // Pram
    @GetMapping("/product/byId")
    public Optional<Product> getByIdPram(@RequestParam Long id){
        System.out.println("Nhan dc: " + id);
        return productRepository.findById(id);
    }

    // Get tung doi tuong
    @GetMapping("/product/{id}")
    public Optional<Product> getById(@PathVariable Long id){
        System.out.println("Nhan dc: " + id);
        return productRepository.findById(id);
    }

    // Them moi: POST
    @PostMapping("/product")
    public Product createOne(@RequestBody Product product){
        System.out.println("Nhan dc: " + product);
        product.setId(null);
        return productRepository.save(product);
    }

    // Them moi: PUT
    @PutMapping("/product")
    public Product editOne(@RequestBody Product product){
        System.out.println("Nhan dc: " + product);
        return productRepository.save(product);
    }


    @DeleteMapping("/product/{id}")
    public void deleteOne(@PathVariable Long id){
        System.out.println("Nhan dc: " + id);
        productRepository.deleteById(id);
    }

}
