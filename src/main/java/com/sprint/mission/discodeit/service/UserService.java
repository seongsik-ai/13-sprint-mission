package com.sprint.mission.discodeit.service;

import java.util.List;
import java.util.UUID;
import com.sprint.mission.discodeit.entity.User;

public interface UserService {

    void create(User user);

    User getById(UUID id);

    List<User> getAll();

    User update(UUID id, String username, String email);

    void delete(UUID id);

}