package com.github.vtapadia.envyleague.service.jpa.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Embeddable
public class NVLPredictionKey implements Serializable {
    @ManyToOne
    @JoinColumn(name = "league")
    private NVLLeague league;
    @ManyToOne
    @JoinColumn(name = "player")
    private NVLPlayer player;
    @ManyToOne
    @JoinColumn(name = "match")
    private NVLMatch match;
}
