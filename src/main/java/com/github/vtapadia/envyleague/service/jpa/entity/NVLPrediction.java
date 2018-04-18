package com.github.vtapadia.envyleague.service.jpa.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.OffsetDateTime;

@Entity
@Table(name = "nvl_prediction")
@Data
public class NVLPrediction {
    @EmbeddedId
    private NVLPredictionKey key;

    private int team_a_score;
    private int team_b_score;
    @CreatedDate
    private OffsetDateTime created;
    @LastModifiedDate
    private OffsetDateTime updated;
    private int score;
}
