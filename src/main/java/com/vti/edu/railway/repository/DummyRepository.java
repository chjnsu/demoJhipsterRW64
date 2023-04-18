package com.vti.edu.railway.repository;

import com.vti.edu.railway.domain.Dummy;
import com.vti.edu.railway.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data JPA repository for the {@link User} entity.
 */
@Repository
public interface DummyRepository extends JpaRepository<Dummy, Long> {
}
