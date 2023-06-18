package com.example.test.repositories;

import com.example.test.models.Shawarma;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShawarmaRepository extends JpaRepository<Shawarma, Long> {
}
