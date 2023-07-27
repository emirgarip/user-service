//package com.example.userservice.proxy;
//
//import com.example.userservice.model.PostDTO;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.Optional;
//
//@FeignClient(name = "post-service")
//public interface PostProxy {
//
//    @GetMapping("/posts/getByAuthorId/{id}")
//    public Boolean getPostByAuthorId(@PathVariable Long id);
//}
