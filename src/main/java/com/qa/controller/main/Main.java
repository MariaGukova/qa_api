package com.qa.controller.main;

import com.qa.repo.*;
import org.springframework.beans.factory.annotation.Autowired;

public class Main {
    @Autowired
    protected RepoAssignee repoAssignee;
    @Autowired
    protected RepoBug repoBug;
    @Autowired
    protected RepoComponent repoComponent;
    @Autowired
    protected RepoDocumentation repoDocumentation;
    @Autowired
    protected RepoDocumentationDivision repoDocumentationDivision;
    @Autowired
    protected RepoHardware repoHardware;
    @Autowired
    protected RepoOS repoOS;
    @Autowired
    protected RepoPriority repoPriority;
    @Autowired
    protected RepoSeverity repoSeverity;
    @Autowired
    protected RepoStatus repoStatus;
    @Autowired
    protected RepoTask repoTask;
    @Autowired
    protected RepoUsers repoUsers;
    @Autowired
    protected RepoExecutor repoExecutor;
    @Autowired
    protected RepoScenario repoScenario;

}
