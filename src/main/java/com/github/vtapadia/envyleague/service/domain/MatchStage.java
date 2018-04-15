package com.github.vtapadia.envyleague.service.domain;

import lombok.Getter;

@Getter
public enum MatchStage {
    GROUP(1),
    MATCH_OF_16(2),
    QUARTER_FINALS(3),
    SEMI_FINALS(4),
    FINALS(5);

    int scoreMultiplier;

    MatchStage(int scoreMultiplier) {
        this.scoreMultiplier = scoreMultiplier;
    }
}
