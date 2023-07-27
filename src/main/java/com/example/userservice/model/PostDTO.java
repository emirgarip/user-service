//package com.example.userservice.model;
//
//import java.util.Objects;
//
//public class PostDTO {
//    private Long id;
//
//    public PostDTO() {
//    }
//
//    public PostDTO(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PostDTO postDTO = (PostDTO) o;
//        return id.equals(postDTO.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//    @Override
//    public String toString() {
//        return "PostDTO{" +
//                "id=" + id +
//                '}';
//    }
//}
