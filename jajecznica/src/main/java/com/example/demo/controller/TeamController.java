package com.example.demo.controller;

import com.example.demo.model.Team;
import com.example.demo.repository.TeamRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamRepository teamRepository;

    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @GetMapping
    public List<Team> getTeams(){
        return teamRepository.findAll();
    }

    @PostMapping
    public Team createTeam(@RequestBody Team team){
        return teamRepository.save(team);
    }
}