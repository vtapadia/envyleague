package com.github.vtapadia.envyleague.service.domain;

import lombok.Data;

@Data
public class Prediction {
    private final League league;
    private final User user;
    private final Match match;
    private final int team_a_score;
    private final int team_b_score;
    private int score;
}
