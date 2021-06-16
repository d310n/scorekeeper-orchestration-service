package com.orchestration.controller;

import com.orchestration.model.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TeamController
{
    @GetMapping(value = "/teams")
    private Team getTeamObject()
    {
        String url = "http://localhost:8080/api/teams";
        RestTemplate restTemplate = new RestTemplate();
        Team result = restTemplate.getForObject(url, Team.class);
        return result;
    }
}
