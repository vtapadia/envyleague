package com.github.vtapadia.envyleague.service.domain;

import lombok.Data;

@Data
public class League {
    private User owner;
    private long price;
}
