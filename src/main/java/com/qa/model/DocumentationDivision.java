package com.qa.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class DocumentationDivision {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)//нельзя изменять и не может быть null
    private Long id;

    private String name;

    @OneToMany(mappedBy = "documentationDivision",orphanRemoval = true)
    List<Documentation> documentations;

    public DocumentationDivision(String name) {
        this.name = name;
        documentations = new ArrayList<>();
    }

    public void addDocumentation(Documentation documentation){
        documentations.add(documentation);
        documentation.setDocumentationDivision(this);
    }

    public void removeDocumentation(Documentation documentation){
        documentations.remove(documentation);
        documentation.setDocumentationDivision(null);
    }
}
