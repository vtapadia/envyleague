package com.github.vtapadia.envyleague.service.domain;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class Match {
    private final String team_a;
    private final String team_b;
    private final OffsetDateTime matchDateTime;
    private final MatchStage matchStage;
    private int team_a_score;
    private int team_b_score;
    private int team_a_penalty_score;
    private int team_b_penalty_score;
}
