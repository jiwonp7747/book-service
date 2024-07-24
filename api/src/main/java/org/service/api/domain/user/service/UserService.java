package org.service.api.domain.user.service;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Null;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.service.api.domain.user.controller.model.UserRequest;
import org.service.db.user.UserEntity;
import org.service.db.user.UserRepository;
import org.service.db.user.enums.UserStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserEntity register(UserEntity entity) {

        return Optional.ofNullable(entity)
                .map(it->{
                    it.setStatus(UserStatus.REGISTERED);
                    it.setRegistered_at(LocalDateTime.now());
                    return userRepository.save(it);
                }).orElseThrow(()->new NullPointerException("UserEntity is null"));
    }
}
