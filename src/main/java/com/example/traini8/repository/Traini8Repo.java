package com.example.traini8.repository;

import com.example.traini8.entity.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Traini8Repo extends JpaRepository<TrainingCenter,Long> {
}
