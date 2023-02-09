package com.qa.response;

import com.qa.model.Bug;
import com.qa.model.Users;
import lombok.*;

import javax.persistence.*;


@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class ResScenario {
    private Long id;
    private String steps;
    private String name;
    private String time;
}
