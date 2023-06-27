package com.stonetek.crudspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "cursos")
public class Course {
    
    @Id
    @GeneratedValue
    @JsonProperty("_id")
    private Long id;

    @Column(name = "nome", length = 100, nullable = false)
    private String name;

    @Column(name = "categoria", length = 50, nullable = false)
    private String category;
}
