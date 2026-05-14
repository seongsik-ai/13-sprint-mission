package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.entity.Channel;

import java.util.List;
import java.util.UUID;

public interface ChannelService {

    // 생성
    Channel create(Channel channel);

    // 단건 조회
    Channel getById(UUID id);

    // 전체 조회
    List<Channel> getAll();

    Channel update(UUID id, String name, String description);

    // 삭제
    void delete(UUID id);
}