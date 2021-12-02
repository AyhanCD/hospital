package com.hospital.hispitalapp.controller;

import com.hospital.hispitalapp.DTO.CommentDto;
import com.hospital.hispitalapp.DTO.CommentPayload;
import com.hospital.hispitalapp.entity.Comment;
import com.hospital.hispitalapp.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor

public class CommentController {
    private final CommentService commentService;

    @GetMapping
    public ResponseEntity<List<Comment>> findAll(){
        return ResponseEntity.ok(commentService.findAll());
    }
//
    @GetMapping("/{id}")
    public ResponseEntity<Comment> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(commentService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Comment> save(@RequestBody CommentDto commentDto){
        return ResponseEntity.ok(commentService.save(commentDto));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        commentService.delete(id);
    }

    @PutMapping
    public ResponseEntity<Comment> update(@RequestBody CommentDto comment){
        return ResponseEntity.ok(commentService.update(comment));
    }
}
