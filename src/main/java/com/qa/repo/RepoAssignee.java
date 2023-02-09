package com.qa.repo;

import com.qa.model.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RepoAssignee extends JpaRepository<Assignee, Long> {
}
