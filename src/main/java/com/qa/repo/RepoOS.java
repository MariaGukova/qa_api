package com.qa.repo;

import com.qa.model.Hardware;
import com.qa.model.OS;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoOS extends JpaRepository<OS, Long> {
}
