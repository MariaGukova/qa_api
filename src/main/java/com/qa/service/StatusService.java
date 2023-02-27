package com.qa.service;

import com.qa.model.Status;
import com.qa.repo.RepoStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {

    private final RepoStatus repoStatus;

    @Autowired
    public StatusService(RepoStatus repoStatus) {
        this.repoStatus = repoStatus;
    }

    public List<Status> findAll(){
        return repoStatus.findAll();
    }

}
