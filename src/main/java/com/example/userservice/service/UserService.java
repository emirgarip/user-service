package com.example.userservice.service;

import com.example.userservice.entity.User;
import com.example.userservice.exception.NotFoundException;
import com.example.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private PostProxy postProxy;

    public User save(User user) {
        return userRepository.save(user);
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void deleteUser(Long id) {
//        if(!postProxy.getPostByAuthorId(id)){
            userRepository.delete(getUser(id));
//        } else {
//            throw new RuntimeException("this user has text, before user, delete user's posts");
//        }
    }

    public User updateUser(Long id, User user) {
        User updateUser = getUser(id);
        updateUser.setUsername(user.getUsername());
        return userRepository.save(updateUser);
    }

//    @KafkaListener(topics = "post-topics", groupId = "user-service")
//    public void updateAmountOfPost(ConsumerRecord<String, String> record) {
//        if(record != null && record.key() != null && record.value() != null) {
//            User updateUser = getUser(Long.parseLong(record.value()));
//            if(Boolean.parseBoolean(record.key())) {
//                updateUser.setAmountOfPost(updateUser.getAmountOfPost()+1);
//            } else {
//                updateUser.setAmountOfPost(updateUser.getAmountOfPost()-1);
//            }
//            userRepository.save(updateUser);
//        }
//    }

    public void updateAmountOfPost(Long id, Boolean isPost) {
        User updateUser = getUser(id);
        if(isPost) {
            updateUser.setAmountOfPost(updateUser.getAmountOfPost()+1);
        } else {
            updateUser.setAmountOfPost(updateUser.getAmountOfPost()-1);
        }
        userRepository.save(updateUser);
    }
}
