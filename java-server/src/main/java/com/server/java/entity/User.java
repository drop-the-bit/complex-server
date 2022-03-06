package com.server.java.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(indexes = {@Index(name = "ix_name", columnList = "name", unique = true)})
public class User extends Base {

    @Id
    @Column(length = 15, nullable = false)
    private String id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 100)
    private String email;

    @Column
    private String address;
}