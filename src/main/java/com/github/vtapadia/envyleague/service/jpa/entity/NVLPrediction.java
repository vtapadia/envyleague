package com.github.vtapadia.envyleague.service.jpa.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigInteger;
import java.time.OffsetDateTime;

@Entity
@Table(name = "nvl_prediction")
@Data
public class NVLPrediction {
    @Id
    private BigInteger id;
    @ManyToOne
    @JoinColumn(name = "league")
    private NVLLeague league;
    @ManyToOne
    @JoinColumn(name = "player")
    private NVLPlayer player;
    @ManyToOne
    @JoinColumn(name = "match")
    private NVLMatch match;
    private int team_a_score;
    private int team_b_score;
    @CreatedDate
    private OffsetDateTime created;
    @LastModifiedDate
    private OffsetDateTime updated;
    private int score;
}
