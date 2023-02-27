package com.qa.service;

import com.qa.model.Bug;
import com.qa.repo.RepoBug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BugService {

    private final RepoBug repoBug;

    @Autowired
    public BugService(RepoBug repoBug) {
        this.repoBug = repoBug;
    }

    public Bug add(Bug bug) {
        return repoBug.save(bug);
    }

    public Bug update(Bug bug) {
        return repoBug.save(bug);
    }

    public Bug find(Long id) {
        return repoBug.getReferenceById(id);
    }

    public List<Bug> findAll() {
        return repoBug.findAll();
    }

}
