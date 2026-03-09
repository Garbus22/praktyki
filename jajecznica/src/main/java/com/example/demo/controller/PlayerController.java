package com.example.demo.controller;

import com.example.demo.model.Player;
import com.example.demo.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers(){
        return playerService.getAllPlayers();
    }

    @PostMapping
    public Player createPlayer(@RequestBody Player player){
        return playerService.save(player);
    }

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable Long id){
        playerService.delete(id);
    }
}