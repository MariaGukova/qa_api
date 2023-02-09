package com.qa.repo;


import com.qa.model.Scenario;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoScenario extends JpaRepository<Scenario, Long> {
    List<Scenario> findByNameContaining(String name);
    Scenario findByName(String name);
}
