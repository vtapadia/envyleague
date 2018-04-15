package com.github.vtapadia.envyleague.service.jpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "nvl_league")
@Data
public class NVLLeague {
    @Id
    private BigInteger id;
    @ManyToOne
    @JoinColumn(name = "owner")
    private NVLPlayer owner;
    private BigInteger buyIn;
}
