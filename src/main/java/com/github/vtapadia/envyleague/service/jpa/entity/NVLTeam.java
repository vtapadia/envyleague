package com.github.vtapadia.envyleague.service.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "nvl_team")
public class NVLTeam {
    @Id
    public BigInteger id;
    public String name;
}
