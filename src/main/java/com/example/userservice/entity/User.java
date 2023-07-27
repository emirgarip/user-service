package com.example.userservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @Column(unique = true)
    @NotBlank
    private String username;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private int amountOfPost;

    public User() {
    }

    public User(Long id, String username, int amountOfPost) {
        this.id = id;
        this.username = username;
        this.amountOfPost = amountOfPost;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAmountOfPost() {
        return amountOfPost;
    }

    public void setAmountOfPost(int amountOfPost) {
        this.amountOfPost = amountOfPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return amountOfPost == user.amountOfPost && id.equals(user.id) && username.equals(user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, amountOfPost);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", amountOfPost=" + amountOfPost +
                '}';
    }
}
