package com.qa.service;

import com.qa.model.Assignee;
import com.qa.model.Status;
import com.qa.repo.RepoAssignee;
import com.qa.repo.RepoStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeService {

    private final RepoAssignee repoAssignee;

    @Autowired
    public AssigneeService(RepoAssignee repoAssignee) {
        this.repoAssignee = repoAssignee;
    }

    public List<Assignee> findAll(){
        return repoAssignee.findAll();
    }

}
