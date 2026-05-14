package com.sprint.mission.discodeit.service.jcf;

import com.sprint.mission.discodeit.entity.Message;
import com.sprint.mission.discodeit.service.MessageService;

import java.util.*;

public class JCFMessageService implements MessageService {

    private final Map<UUID, Message> data;

    public JCFMessageService() {
        this.data = new HashMap<>();
    }

    @Override
    public void create(Message message) {
        data.put(message.getId(), message);
    }

    @Override
    public Message getById(UUID id) {
        return data.get(id);
    }

    @Override
    public List<Message> getAll() {
        return new ArrayList<>(data.values());
    }

    @Override
    public Message update(UUID id, String content) {

        Message message = data.get(id);

        if (message == null) {
            throw new NoSuchElementException("Message not found: " + id);
        }

        message.update(content);
        return message;
    }

    @Override
    public void delete(UUID id) {
        data.remove(id);
    }
}