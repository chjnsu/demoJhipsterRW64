package com.vti.edu.railway.repository;

import com.vti.edu.railway.domain.Dummy;
import com.vti.edu.railway.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
