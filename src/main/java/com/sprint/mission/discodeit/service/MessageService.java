package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.entity.Message;

import java.util.List;
import java.util.UUID;

public interface MessageService {

    // 생성
    void create(Message message);

    // 단건 조회
    Message getById(UUID id);

    // 전체 조회
    List<Message> getAll();

    // 수정
    Message update(UUID id, String content);

    // 삭제
    void delete(UUID id);
}