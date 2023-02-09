package com.qa.repo;

import com.qa.model.Severity;
import com.qa.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoStatus extends JpaRepository<Status, Long> {
}
