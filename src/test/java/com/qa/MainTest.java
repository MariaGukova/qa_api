package com.qa;

import com.qa.model.*;
import com.qa.model.enums.Roles;
import com.qa.service.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MainTest {

    @Autowired
    private BugService bugService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private HardwareService hardwareService;
    @Autowired
    private StatusService statusService;
    @Autowired
    private AssigneeService assigneeService;
    @Autowired
    private ComponentService componentService;
    @Autowired
    private UserService userService;
    @Autowired
    private ScenarioService scenarioService;

    @Test
    void CreateBug() {
        Task task = taskService.findAll().get(0);
        Hardware hardware = hardwareService.findAll().get(0);
        Status status = statusService.findAll().get(0);
        Assignee assignee = assigneeService.findAll().get(0);
        Component component = componentService.findAll().get(0);
        Users creator = userService.findAll().get(0);

        Bug bug = new Bug(task, creator, component, hardware, status, assignee, "Название", "Описание");

        bug = bugService.add(bug);

        Assertions.assertNotNull(bug);

        Assertions.assertEquals(bug.getId(), bugService.find(bug.getId()).getId());
    }

    @Test
    void UpdateScenario() {
        Scenario scenario = scenarioService.findAll().get(0);
        String newName = "Новое имя";

        Assertions.assertNotNull(scenario);

        scenario.setName(newName);

        scenario = scenarioService.update(scenario);

        Assertions.assertNotNull(scenario);

        Assertions.assertEquals(scenario.getName(), newName);
    }

    @Test
    void UpdateBugAddress() {
        Bug bug = bugService.findAll().get(0);
        Assignee newAssignee = assigneeService.findAll().get(0);

        Assertions.assertNotNull(bug);
        bug.setAssignee(newAssignee);

        bug = bugService.update(bug);
        Assertions.assertNotNull(bug);

        Assertions.assertEquals(bug.getAssignee().getId(), newAssignee.getId());
    }

    @Test
    void ChangeRole() {
        Roles newRole = Roles.Senior_Tester;

        Users user = userService.findAll().get(0);

        Assertions.assertNotNull(user);

        user.setRole(newRole);

        user = userService.update(user);

        Assertions.assertNotNull(user);

        Assertions.assertEquals(user.getRole(), newRole);
    }
}
