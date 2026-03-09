package com.example.demo.service;

import com.example.demo.model.Player;
import com.example.demo.model.Stats;
import com.example.demo.repository.StatsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatsService {

    private final StatsRepository statsRepository;

    public StatsService(StatsRepository statsRepository) {
        this.statsRepository = statsRepository;
    }

    public Stats saveStats(Stats stats){
        return statsRepository.save(stats);
    }

    public List<Stats> getPlayerStats(Player player){
        return statsRepository.findByPlayer(player);
    }
}