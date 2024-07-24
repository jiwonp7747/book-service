package org.service.api.domain.user.converter;

import lombok.extern.slf4j.Slf4j;
import org.service.api.common.annotation.Converter;
import org.service.api.domain.user.controller.model.UserRequest;
import org.service.api.domain.user.controller.model.UserResponse;
import org.service.db.user.UserEntity;

@Converter
@Slf4j
public class UserConverter {

    public UserResponse toResponse(UserEntity userEntity){
        return UserResponse.builder()
                .id(userEntity.getId())
                .password(userEntity.getPassword())
                .email(userEntity.getEmail())
                .name(userEntity.getName())
                .status(userEntity.getStatus())
                .last_login_at(userEntity.getLast_login_at())
                .registered_at(userEntity.getRegistered_at())
                .deleted_at(userEntity.getDeleted_at())
                .build();
    }

    public UserEntity toEntity(UserRequest request){
        log.info(request.getPassword());
        return UserEntity.builder()
                .name(request.getName())
                .password(request.getPassword())
                .email(request.getEmail())
                .build()
                ;
    }
}
