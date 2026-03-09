package com.example.demo.controller;

import com.example.demo.model.Match;
import com.example.demo.service.MatchService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matches")
public class MatchController {

    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @PostMapping
    public Match createMatch(@RequestBody Match match){
        return matchService.createMatch(match);
    }
}