package com.example.demo.service;

import com.example.demo.model.Match;
import com.example.demo.model.Team;
import com.example.demo.repository.MatchRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    private final MatchRepository matchRepository;

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public Match createMatch(Match match){
        return matchRepository.save(match);
    }

    public List<Match> getMatchesByTeam(Team team){
        return matchRepository.findByTeamAOrTeamB(team, team);
    }
}