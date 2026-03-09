package com.example.demo.controller;

import com.example.demo.model.Stats;
import com.example.demo.service.StatsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stats")
public class StatsController {

    private final StatsService statsService;

    public StatsController(StatsService statsService) {
        this.statsService = statsService;
    }

    @PostMapping
    public Stats addStats(@RequestBody Stats stats){
        return statsService.saveStats(stats);
    }
}