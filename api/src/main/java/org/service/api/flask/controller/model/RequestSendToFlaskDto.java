package org.service.api.flask.controller.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class RequestSendToFlaskDto {

    private String bookName;
    private String description;
}
