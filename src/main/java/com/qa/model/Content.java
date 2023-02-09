//package com.qa.model;
//
//import lombok.AccessLevel;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//@Entity
//@NoArgsConstructor
//@Getter
//@Setter
//public class Content {
//    @Setter(AccessLevel.NONE)
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(nullable = false, updatable = false)//нельзя изменять и не может быть null
//    private Long id;
//
//    private Long id_task;
//    private String source; //источник
//    private String steps;
//    private String attachment;
//
//    public Content(Long id_task, String source, String steps, String attachment) {
//        this.id_task = id_task;
//        this.source = source;
//        this.steps = steps;
//        this.attachment = attachment;
//    }
//
//}
