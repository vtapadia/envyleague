package com.github.vtapadia.envyleague.service.web;

import com.github.vtapadia.envyleague.service.domain.Match;
import com.github.vtapadia.envyleague.service.domain.MatchStage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/api/match")
public class MatchController {

    @GetMapping("/all")
    public Flux<Match> getMatches() {
        return Flux.just(new Match("a","b", OffsetDateTime.now(), MatchStage.GROUP));
    }

}
