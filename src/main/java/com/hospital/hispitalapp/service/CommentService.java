package com.hospital.hispitalapp.service;

import com.hospital.hispitalapp.DTO.CommentDto;
import com.hospital.hispitalapp.DTO.CommentPayload;
import com.hospital.hispitalapp.entity.Comment;
import com.hospital.hispitalapp.entity.Hospital;
import com.hospital.hispitalapp.repository.CommentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {


    private final CommentRepository commentRepository;

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    public Comment findById(Long id) {
        return commentRepository.findById(id).get();
    }

    public Comment save(CommentDto commentDto) {
        Hospital hospital = new Hospital();
        hospital.setId(commentDto.getHospitalId());
        Comment comment = new Comment();
        comment.setComment(commentDto.getComment());
        comment.setId(commentDto.getId());
        comment.setEmail(commentDto.getEmail());
        comment.setAuthor(commentDto.getAuthor());
        comment.setIsPublished(commentDto.getIsPublished());
        comment.setHospital(hospital);


        return commentRepository.save(comment);

    }

    public void delete(Long id) {
        Comment commentForDelete = commentRepository.findById(id).get();
        commentRepository.delete(commentForDelete);
    }

    public Comment update(CommentDto comment) {
        Comment commentForUpdate = commentRepository.findById(comment.getId()).get();
        Hospital hospital = new Hospital();
        hospital.setId(comment.getHospitalId());

        commentForUpdate.setComment(comment.getComment());
        commentForUpdate.setEmail(comment.getEmail());
        commentForUpdate.setAuthor(comment.getAuthor());
        commentForUpdate.setHospital(hospital);
        commentForUpdate.setIsPublished(comment.getIsPublished());

        return commentRepository.save(commentForUpdate);
    }
}
