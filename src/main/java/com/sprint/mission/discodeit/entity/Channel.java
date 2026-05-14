package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class Channel {

    private final UUID id;
    private final Long createdAt;
    private Long updatedAt;

    private String name;
    private String description;

    // 생성자
    public Channel(String name, String description) {

        if (name == null || description == null) {
            throw new IllegalArgumentException("name or description cannot be null");
        }

        this.id = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = this.createdAt;

        this.name = name;
        this.description = description;
    }

    // Getter
    public UUID getId() {
        return id;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // update 메서드
    public void update(String name, String description) {

        if (name == null || description == null) {
            throw new IllegalArgumentException("name or description cannot be null");
        }

        this.name = name;
        this.description = description;
        this.updatedAt = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Channel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
