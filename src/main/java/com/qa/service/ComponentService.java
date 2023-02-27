package com.qa.service;

import com.qa.model.Assignee;
import com.qa.model.Component;
import com.qa.repo.RepoAssignee;
import com.qa.repo.RepoComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentService {

    private final RepoComponent repoComponent;

    @Autowired
    public ComponentService(RepoComponent repoComponent) {
        this.repoComponent = repoComponent;
    }

    public List<Component> findAll(){
        return repoComponent.findAll();
    }

}
