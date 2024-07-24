package org.service.db.user.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public enum UserStatus {
    REGISTERED("등록"),
    UNREGISTERED("해제")
    ;

    private String description;
}
