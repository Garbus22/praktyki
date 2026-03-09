package com.example.demo.repository;

import com.example.demo.model.Player;
import com.example.demo.model.Stats;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StatsRepository extends JpaRepository<Stats, Long> {

    List<Stats> findByPlayer(Player player);

}