package com.qa.repo;

import com.qa.model.Documentation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoDocumentation extends JpaRepository<Documentation, Long> {
}
