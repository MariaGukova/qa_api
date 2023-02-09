package com.qa.repo;

import com.qa.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoTask extends JpaRepository <Task, Long> {

    List<Task> findByNameContaining(String name);

    Task findByName(String name);
}
