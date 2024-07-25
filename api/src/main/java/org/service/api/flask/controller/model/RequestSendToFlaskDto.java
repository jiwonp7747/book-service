package org.service.api.flask.controller.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestSendToFlaskDto {

    private String nickname;
    private String fileId;
}
