package com.example.traini8.service;

import com.example.traini8.entity.TrainingCenter;
import com.example.traini8.repository.Traini8Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Traini8Service {
    @Autowired
    Traini8Repo tr;
    public List<TrainingCenter> getAlltrainingcenters(){
        return tr.findAll();   //method to get all trainingcenter
    }
    public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter){
        return tr.save(trainingCenter);   //method to post training center
    }
}
