package com.vti.edu.railway.repository;

import com.vti.edu.railway.domain.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<Dummy, Long> {}
