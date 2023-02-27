package com.qa.service;

import com.qa.model.Task;
import com.qa.repo.RepoTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final RepoTask repoTask;

    @Autowired
    public TaskService(RepoTask repoTask) {
        this.repoTask = repoTask;
    }

    public List<Task> findAll(){
        return repoTask.findAll();
    }

}
