package com.github.vtapadia.envyleague.service.jpa.entity;


import com.github.vtapadia.envyleague.service.domain.MatchStage;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.OffsetDateTime;

@Entity
@Table(name = "nvl_match")
@Data
public class NVLMatch implements Serializable {
    @Id
    public BigInteger id;

    @ManyToOne
    @JoinColumn(name = "team_a")
    private NVLTeam team_a;
    @ManyToOne
    @JoinColumn(name = "team_b")
    private NVLTeam team_b;
    private OffsetDateTime matchDateTime;
    @Enumerated(EnumType.STRING)
    private MatchStage matchStage;

    private int team_a_score;
    private int team_b_score;
    private int team_a_penalty_score;
    private int team_b_penalty_score;
}
