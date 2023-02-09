package com.qa.repo;

import com.qa.model.Bug;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoBug extends JpaRepository<Bug, Long> {
    List<Bug> findBySummaryContaining(String name);

    Bug findBySummary(String summary);
}
