package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Team teamA;

    @ManyToOne
    private Team teamB;

    @ManyToOne
    private GameMap map;

    public Long getId() { return id; }

    public Team getTeamA() { return teamA; }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public Team getTeamB() { return teamB; }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

    public GameMap getMap() { return map; }

    public void setMap(GameMap map) {
        this.map = map;
    }
}