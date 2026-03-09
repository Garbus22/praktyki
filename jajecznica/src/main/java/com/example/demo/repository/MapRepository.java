package com.example.demo.repository;

import com.example.demo.model.GameMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapRepository extends JpaRepository<GameMap, Long> {
}