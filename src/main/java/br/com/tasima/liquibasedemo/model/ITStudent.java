package br.com.tasima.liquibasedemo.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="IT_STUDENT")
public class ITStudent {
    @Id
    @NonNull
    @Column(name="ID")
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="AGE")
    private Long age;

    @Column(name="FAVORITE_PROGRAMMING_LANGUAGE")
    private String favoriteProgrammingLanguage;
}
