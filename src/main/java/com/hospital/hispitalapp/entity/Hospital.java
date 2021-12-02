package com.hospital.hispitalapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name = "hospitals")
@NoArgsConstructor
@AllArgsConstructor
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private  String email;
    private String phone;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "hospital_id")
    @Fetch(FetchMode.JOIN)
    private List<Comment> commentList = new ArrayList<>();
}
