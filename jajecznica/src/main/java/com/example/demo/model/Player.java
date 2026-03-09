package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;

    @ManyToOne
    private Team team;

    public Long getId() { return id; }

    public String getNickname() { return nickname; }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Team getTeam() { return team; }

    public void setTeam(Team team) {
        this.team = team;
    }
}