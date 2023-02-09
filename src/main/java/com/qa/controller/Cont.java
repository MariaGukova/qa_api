package com.qa.controller;

import com.qa.controller.main.Main;
import com.qa.model.Bug;
import com.qa.model.Documentation;
import com.qa.model.Scenario;
import com.qa.response.ResBug;
import com.qa.response.ResDocumentation;
import com.qa.response.ResScenario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Cont extends Main {
    @GetMapping("/bug/{id}")
    public ResponseEntity<?> getBug(@PathVariable Long id) {
        Bug bug;
        try {
            bug = repoBug.findById(id).orElseThrow();
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        ResBug resBug = new ResBug();
        resBug.setId(bug.getId());
        resBug.setDescription(bug.getDescription());
        resBug.setSummary(bug.getSummary());
        return new ResponseEntity<>(resBug, HttpStatus.OK);
    }

    @GetMapping("/scenario/{id}")
    public ResponseEntity<?> getScenario(@PathVariable Long id) {
        Scenario scenario;
        try {
            scenario = repoScenario.findById(id).orElseThrow();
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        ResScenario resScenario = new ResScenario();
        resScenario.setId(scenario.getId());
        resScenario.setName(scenario.getName());
        resScenario.setSteps(scenario.getSteps());
        resScenario.setTime(scenario.getTime());
        return new ResponseEntity<>(resScenario, HttpStatus.OK);
    }
    @GetMapping("/doc/{id}")
    public ResponseEntity<?> getDocumentation(@PathVariable Long id) {
        Documentation documentation;
        try {
            documentation = repoDocumentation.findById(id).orElseThrow();
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        ResDocumentation resDocumentation = new ResDocumentation();
        resDocumentation.setId(documentation.getId());
        resDocumentation.setName(documentation.getName());
        resDocumentation.setDescription(documentation.getDescription());
        resDocumentation.setAttachment(documentation.getAttachment());
        return new ResponseEntity<>(resDocumentation, HttpStatus.OK);
    }

    @PostMapping("/doc/add")
    public ResponseEntity<?> addDoc(@RequestBody Documentation documentation) {
        if (documentation == null || documentation.getDescription() == null || documentation.getName() == null || documentation.getId() != null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        documentation = repoDocumentation.saveAndFlush(documentation);
        ResDocumentation resDocumentation = new ResDocumentation(documentation.getId(), documentation.getName(), documentation.getDescription(), documentation.getAttachment());
        return new ResponseEntity<>(resDocumentation, HttpStatus.OK);
    }

    @PostMapping("/scenario/add")
    public ResponseEntity<?> addScenario(@RequestBody Scenario scenario) {
        if (scenario == null || scenario.getName() == null || scenario.getSteps() == null || scenario.getTime() == null || scenario.getId() != null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        scenario = repoScenario.saveAndFlush(scenario);
        ResScenario resScenario = new ResScenario(scenario.getId(), scenario.getName(), scenario.getSteps(), scenario.getTime());
        return new ResponseEntity<>(resScenario, HttpStatus.OK);
    }
}
