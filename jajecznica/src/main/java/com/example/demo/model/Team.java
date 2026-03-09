package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "team")
    private List<Player> players;

    public Long getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() { return players; }
}