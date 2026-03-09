package com.example.demo.repository;

import com.example.demo.model.Match;
import com.example.demo.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MatchRepository extends JpaRepository<Match, Long> {

    List<Match> findByTeamAOrTeamB(Team teamA, Team teamB);

}