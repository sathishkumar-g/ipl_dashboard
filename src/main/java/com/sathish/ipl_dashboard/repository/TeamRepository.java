package com.sathish.ipl_dashboard.repository;

import com.sathish.ipl_dashboard.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {

    public Team findByTeamName(String teamName);
}
