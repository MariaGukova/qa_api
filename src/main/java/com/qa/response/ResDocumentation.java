package com.qa.response;

import com.qa.model.DocumentationDivision;
import com.qa.model.Task;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class ResDocumentation {
    private Long id;
    private String name;
    private String description;
    private String attachment;
}