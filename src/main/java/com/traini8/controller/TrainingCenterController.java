package com.traini8.controller;

import com.traini8.entity.TrainingCenter;
import com.traini8.repository.TrainingCenterRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/training-centers")
public class TrainingCenterController {
    private final TrainingCenterRepository repository;

    public TrainingCenterController(TrainingCenterRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter center) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(center));
    }

    @GetMapping
    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}
