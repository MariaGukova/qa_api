package com.qa.service;

import com.qa.model.Assignee;
import com.qa.model.Scenario;
import com.qa.repo.RepoAssignee;
import com.qa.repo.RepoScenario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScenarioService {

    private final RepoScenario repoScenario;

    @Autowired
    public ScenarioService(RepoScenario repoScenario) {
        this.repoScenario = repoScenario;
    }

    public List<Scenario> findAll(){
        return repoScenario.findAll();
    }

    public Scenario find(Long id) {
        return repoScenario.getReferenceById(id);
    }
    public Scenario update(Scenario scenario){
        return repoScenario.save(scenario);
    }

}
