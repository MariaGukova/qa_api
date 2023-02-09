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
public class Task {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)//нельзя изменять и не может быть null
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users user;
    @OneToOne
    private Priority priority;
    @OneToOne
    private Severity severity;
    @OneToOne
    private OS os;
    @OneToOne
    private Executor executor;
    @OneToOne
    private Documentation documentation;

    private String name;
    private String deadline;

    public Task(Users user, String name, Executor executor, String deadline, Priority priority, Severity severity, OS os) {
        this.name = name;
        this.executor = executor;
        this.deadline = deadline;
        this.priority = priority;
        this.severity = severity;
        this.os = os;
        this.user = user;
    }
}
