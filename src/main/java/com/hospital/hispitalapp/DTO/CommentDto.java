package com.hospital.hispitalapp.DTO;

import com.hospital.hispitalapp.entity.Hospital;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class CommentDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;
    private String email;
    private String author;
    private int isPublished;
    private Long  hospitalId;


}
