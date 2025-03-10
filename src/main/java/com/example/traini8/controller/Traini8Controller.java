package com.example.traini8.controller;

import com.example.traini8.entity.TrainingCenter;
import com.example.traini8.service.Traini8Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
public class Traini8Controller {
    @Autowired
    Traini8Service ts;
    @GetMapping("/traini8")
    public ResponseEntity<List<TrainingCenter>> getAlltrainingCenter(){
        List<TrainingCenter>allCenter=ts.getAlltrainingcenters();
        return ResponseEntity.ok(allCenter);
    }
    @PostMapping("traini8")
    public ResponseEntity<TrainingCenter> postTrainingCenter(@RequestBody TrainingCenter trainingCenter){
        TrainingCenter saveCenter=ts.saveTrainingCenter(trainingCenter);
        return ResponseEntity.ok(saveCenter);
    }
}
