package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Stats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Player player;

    private int kills;
    private int deaths;
    private int assists;

    public Long getId() { return id; }

    public Player getPlayer() { return player; }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getKills() { return kills; }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() { return deaths; }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getAssists() { return assists; }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public double getKD() {
        if(deaths == 0) return kills;
        return (double) kills / deaths;
    }
}