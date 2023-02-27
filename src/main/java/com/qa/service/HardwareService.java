package com.qa.service;

import com.qa.model.Hardware;
import com.qa.repo.RepoHardware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HardwareService {

    private final RepoHardware repoHardware;

    @Autowired
    public HardwareService(RepoHardware repoHardware) {
        this.repoHardware = repoHardware;
    }

    public List<Hardware> findAll(){
        return repoHardware.findAll();
    }

}
