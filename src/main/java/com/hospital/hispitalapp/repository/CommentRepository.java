package com.hospital.hispitalapp.repository;

import com.hospital.hispitalapp.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
