package com.ruthapp.todo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "TODO")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "TITLE")
    public String title;

    @Column(name = "DESCRIPTION")
    public String description;
}
