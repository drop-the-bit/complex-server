package com.server.java.entity;

import com.server.java.constants.Constants;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(indexes = {@Index(name = "ix_title", columnList = "title", unique = true)})
public class Book extends Base {

    @Id
    @GeneratedValue(generator = Constants.STRATEGY_UUID2)
    @GenericGenerator(name = Constants.STRATEGY_UUID2, strategy = Constants.STRATEGY_UUID2)
    private String id;

    @Column(length = 50, nullable = false)
    private String title;

    @Column(length = 100)
    private String subtitle;

    @Column(columnDefinition = "TEXT")
    private String summary;

    @Column(length = 20)
    private String category;

    @Column(length = 50, nullable = false)
    private String writer;
}