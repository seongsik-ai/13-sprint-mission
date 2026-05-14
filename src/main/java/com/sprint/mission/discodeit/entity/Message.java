package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class Message {

    private final UUID id;
    private final Long createdAt;
    private Long updatedAt;

    private String content;
    private final UUID userId;
    private final UUID channelId;

    // 생성자
    public Message(String content, UUID userId, UUID channelId) {

        if (content == null || userId == null || channelId == null) {
            throw new IllegalArgumentException("Message fields cannot be null");
        }

        this.id = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = this.createdAt;

        this.content = content;
        this.userId = userId;
        this.channelId = channelId;
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

    public String getContent() {
        return content;
    }

    public UUID getUserId() {
        return userId;
    }

    public UUID getChannelId() {
        return channelId;
    }

    // 메시지 수정
    public void update(String content) {

        if (content == null) {
            throw new IllegalArgumentException("content cannot be null");
        }

        this.content = content;
        this.updatedAt = System.currentTimeMillis();
    }
    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                ", channelId=" + channelId +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return id.equals(message.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}