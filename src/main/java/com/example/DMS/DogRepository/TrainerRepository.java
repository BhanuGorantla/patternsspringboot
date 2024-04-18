package com.example.DMS.DogRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository; 

import com.example.DMS.Models.Trainer;

@Repository 
public interface TrainerRepository extends CrudRepository<Trainer, Integer> {
    
}

