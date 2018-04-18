package com.github.vtapadia.envyleague.service.jpa.entity;

import com.github.vtapadia.envyleague.service.jpa.entity.NVLLeague;
import com.github.vtapadia.envyleague.service.jpa.entity.NVLPlayer;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;


@Embeddable
public class NVLLeaguePlayerKey implements Serializable {
    @ManyToOne
    @JoinColumn(name = "league")
    NVLLeague league;
    @ManyToOne
    @JoinColumn(name = "player")
    NVLPlayer player;
}
