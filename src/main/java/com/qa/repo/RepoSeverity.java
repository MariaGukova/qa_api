package com.qa.repo;

import com.qa.model.Priority;
import com.qa.model.Severity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoSeverity extends JpaRepository<Severity, Long> {
}
