package org.service.api.flask.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.service.api.flask.controller.model.RequestSendToFlaskDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@RequiredArgsConstructor
public class FlaskService {

    //데이터를 JSON 객체로 변환하기 위해서 사용
    private final ObjectMapper objectMapper;

    @Transactional
    public String sendToFlask(RequestSendToFlaskDto dto) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);

        String body = objectMapper.writeValueAsString(dto);

        HttpEntity<String> entity = new HttpEntity<>(body, headers);

        //실제 Flask 서버랑 연결하기 위한 URL
        String url = "http://127.0.0.1:8082/receive_string";

        log.info("스프링 서버에서 플라스크로 요청하기 전");

        //Flask 서버로 데이터를 전송하고 받은 응답 값을 return
        return restTemplate.postForObject(url, entity, String.class);
    }
}
