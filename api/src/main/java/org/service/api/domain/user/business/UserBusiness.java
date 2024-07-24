package org.service.api.domain.user.business;

import lombok.RequiredArgsConstructor;
import org.service.api.common.annotation.Business;
import org.service.api.domain.user.controller.model.UserRequest;
import org.service.api.domain.user.controller.model.UserResponse;
import org.service.api.domain.user.converter.UserConverter;
import org.service.api.domain.user.service.UserService;

@Business
@RequiredArgsConstructor
public class UserBusiness {

    private final UserConverter userConverter;
    private final UserService userService;

    public UserResponse register(UserRequest request){
        var entity=userConverter.toEntity(request);
        var newEntity=userService.register(entity);
        return userConverter.toResponse(newEntity);
    }
}
