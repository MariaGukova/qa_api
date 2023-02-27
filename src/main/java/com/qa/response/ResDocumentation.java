package com.qa.response;

import lombok.*;


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