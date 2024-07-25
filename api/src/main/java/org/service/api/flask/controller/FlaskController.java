package org.service.api.flask.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.service.api.flask.controller.model.RequestSendToFlaskDto;
import org.service.api.flask.service.FlaskService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/flask")
public class FlaskController {

    private final FlaskService flaskService;

    @PostMapping("")
    public String sendToFlask(@RequestBody RequestSendToFlaskDto dto) throws JsonProcessingException {
        return flaskService.sendToFlask(dto);
    }
}
