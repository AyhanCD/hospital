package com.hospital.hispitalapp.DTO;

import com.hospital.hispitalapp.entity.Hospital;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
public class CommentPayload {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;
    private String email;
    private String author;
    private int isPublished;
    private Hospital hospital;
}
