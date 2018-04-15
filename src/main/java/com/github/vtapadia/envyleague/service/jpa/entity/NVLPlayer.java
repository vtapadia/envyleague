package com.github.vtapadia.envyleague.service.jpa.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nvl_player")
@Data
public class NVLPlayer {
    @Id
    private String email;
    private String name;
}
