package com.example.test.services;

import com.example.test.models.Shawarma;
import com.example.test.repositories.ShawarmaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ShawarmaService {
    private final ShawarmaRepository shawarmaRepository;

    public List<Shawarma> listShawarmas() {
        return shawarmaRepository.findAll();
    }

    public void saveShawarma(Shawarma product) {
        log.info("Saving new {}", product);
        shawarmaRepository.save(product);
    }

    public void deleteShawarma(Long id) {
        shawarmaRepository.deleteById(id);
    }

    public Shawarma getShawarmaById(Long id) {
        return shawarmaRepository.findById(id).orElse(null);
    }


}
