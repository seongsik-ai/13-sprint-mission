package com.sprint.mission.discodeit;

import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.service.UserService;
import com.sprint.mission.discodeit.service.jcf.JCFUserService;

public class JavaApplication {

    public static void main(String[] args) {

        UserService userService = new JCFUserService();

        // 1. 생성
        User user1 = new User("kim", "kim@test.com");
        User user2 = new User("lee", "lee@test.com");

        userService.create(user1);
        userService.create(user2);

        // 2. 전체 조회
        System.out.println("전체 조회: " + userService.getAll());

        // 3. 단건 조회
        System.out.println("단건 조회: " + userService.getById(user1.getId()));

        // 4. 수정
        userService.update(user1.getId(), "park", "park@test.com");

        // 5. 수정 후 조회
        System.out.println("수정 후 조회: " + userService.getById(user1.getId()));

        // 6. 삭제
        userService.delete(user1.getId());

        // 7. 삭제 후 전체 조회
        System.out.println("삭제 후 전체 조회: " + userService.getAll());
    }
}