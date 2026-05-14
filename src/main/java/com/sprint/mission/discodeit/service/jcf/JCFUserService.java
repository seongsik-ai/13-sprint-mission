package com.sprint.mission.discodeit.service.jcf;

import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.service.UserService;

import java.util.*;

public class JCFUserService implements UserService {

    private final Map<UUID, User> data;

    public JCFUserService() {
        this.data = new HashMap<>();
    }

    @Override
    public void create(User user) {
        data.put(user.getId(), user);
    }

    @Override
    public User getById(UUID id) {
        return data.get(id);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(data.values());
    }

    @Override
    public User update(UUID id, String username, String email) {

        User user = data.get(id);

        if (user == null) {
            throw new NoSuchElementException("User not found: " + id);
        }

        user.update(username, email);
        return user;
    }

    @Override
    public void delete(UUID id) {
        data.remove(id);
    }
}