package org.service.api.domain.user.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.service.api.domain.user.business.UserBusiness;
import org.service.api.domain.user.controller.model.UserRequest;
import org.service.api.domain.user.controller.model.UserResponse;
import org.service.api.domain.user.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserBusiness userBusiness;

    @PostMapping("/register")
    public UserResponse register(
            @Valid
            @RequestBody UserRequest request
    ) {
        return userBusiness.register(request);
    }
}
