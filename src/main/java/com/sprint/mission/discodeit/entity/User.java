package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class User {

    private final UUID id;
    private final Long createdAt;
    private Long updatedAt;

    private String username;
    private String email;


    public User(String username, String email) {

        if (username == null || email == null) {
            throw new IllegalArgumentException("username or email cannot be null");
        }

        this.id = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = this.createdAt;

        this.username = username;
        this.email = email;
    }


    public UUID getId() {
        return id;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }


    public void update(String username, String email) {

        if (username == null || email == null) {
            throw new IllegalArgumentException("username or email cannot be null");
        }

        this.username = username;
        this.email = email;
        this.updatedAt = System.currentTimeMillis();
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}