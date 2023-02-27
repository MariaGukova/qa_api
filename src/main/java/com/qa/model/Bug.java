package com.qa.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Bug {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)//нельзя изменять и не может быть null
    private Long id;
    @OneToOne
    private Task task;
    @OneToOne
    private Hardware hardware;
    @OneToOne
    private Status status;
    @OneToOne
    private Assignee assignee;
    @OneToOne
    private Component component;
    @OneToOne
    private Users creator;
    private String summary;
    private String description;
    private String attachment;

    public Bug(Task task, Users creator, Component component, Hardware hardware, Status status, Assignee assignee, String summary, String description) {
        this.task = task;
        this.creator = creator;
        this.component = component;
        this.hardware = hardware;
        this.status = status;
        this.assignee = assignee;
        this.summary = summary;
        this.description = description;
    }
}
