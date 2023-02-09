package com.qa.repo;

import com.qa.model.Component;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoComponent extends JpaRepository<Component, Long> {
}
