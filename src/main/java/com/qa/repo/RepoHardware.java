package com.qa.repo;

import com.qa.model.Component;
import com.qa.model.Hardware;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoHardware extends JpaRepository<Hardware, Long> {
}
