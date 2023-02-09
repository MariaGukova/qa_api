package com.qa.repo;

import com.qa.model.Executor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoExecutor extends JpaRepository<Executor, Long> {
}
