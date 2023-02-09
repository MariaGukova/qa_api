package com.qa.model;

import com.qa.config.SecurityConfig;
import com.qa.model.enums.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.naming.HandlerRef;

import javax.persistence.*;
import java.sql.Time;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Scenario {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)//нельзя изменять и не может быть null
    private Long id;

    @OneToOne
    private Bug bug;
    @OneToOne
    private Users creator;

    private String steps;
    private String name;
    private String time;

    public Scenario(Bug bug,Users creator,  String steps, String name, String time) {
        this.creator = creator;
        this.bug = bug;
        this.steps = steps;
        this.name = name;
        this.time = time;
    }
}
