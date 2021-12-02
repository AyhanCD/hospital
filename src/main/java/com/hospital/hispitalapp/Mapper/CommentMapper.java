////package com.hospital.hispitalapp.Mapper;
////
////import com.hospital.hispitalapp.DTO.CommentDto;
////import com.hospital.hispitalapp.DTO.CommentPayload;
////import com.hospital.hispitalapp.entity.Comment;
////import org.mapstruct.Context;
////import org.mapstruct.Mapper;
////import org.mapstruct.Mapping;
////import org.mapstruct.factory.Mappers;
////
////@Mapper
////public abstract class CommentMapper {
////
////    public static final CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);
////
////    @Mapping(target = "id",source = "id")
////    @Mapping(target = "comment",source = "comment")
////    @Mapping(target = "email",source = "email")
////    @Mapping(target = "author",source = "author")
////    @Mapping(target = "isPublished",source = "isPublished")
////    @Mapping(target = "hospital",source = "hospital")
////    public abstract Comment payloadToEntity( CommentPayload commentPayload);
////
////
////
////    @Mapping(target = "id",source = "id")
////    @Mapping(target = "comment",source = "comment")
////    @Mapping(target = "email",source = "email")
////    @Mapping(target = "author",source = "author")
////    @Mapping(target = "isPublished",source = "isPublished")
////    @Mapping(target = "hospital",source = "hospital")
////
////
////    public abstract CommentDto entityToDto( Comment comment);
//
//
//
//
//
//
//}
