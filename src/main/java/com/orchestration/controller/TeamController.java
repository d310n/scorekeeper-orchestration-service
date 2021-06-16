package com.orchestration.controller;

import com.orchestration.model.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TeamController
{
    @GetMapping(value = "teams")
    public Team getTeam()
    {
        return new Team();
    }

    @GetMapping(value = "/getteamstring")
    private String getTeamString()
    {
        String url = "http://localhost:8081/teams";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }

    @GetMapping(value = "/getteam")
    private Team getTeamObject()
    {
        String url = "http://localhost:8081/team";
        RestTemplate restTemplate = new RestTemplate();
        Team result = restTemplate.getForObject(url, Team.class);
        return result;
    }
}
