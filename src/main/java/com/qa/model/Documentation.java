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
public class Documentation {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)//нельзя изменять и не может быть null
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private DocumentationDivision documentationDivision;
    @OneToOne
    private Task task;

    private String name;
    private String description;
    private String attachment;

    public Documentation(String name, String description) {
        this.name = name;
        this.description = description;
    }
}