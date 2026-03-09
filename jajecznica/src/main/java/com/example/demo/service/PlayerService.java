package com.example.demo.service;

import com.example.demo.model.Player;
import com.example.demo.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    public Player save(Player player){
        return playerRepository.save(player);
    }

    public void delete(Long id){
        playerRepository.deleteById(id);
    }
}