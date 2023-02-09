package com.qa.repo;


import com.qa.model.Priority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoPriority extends JpaRepository<Priority, Long> {
}
