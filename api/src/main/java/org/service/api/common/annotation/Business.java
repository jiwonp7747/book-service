package org.service.api.common.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Service
@Target(ElementType.TYPE) // 애노테이션이 적용될 타입
@Retention(RetentionPolicy.RUNTIME) // 애노테이션이 어느 시점까지 유지될지
public @interface Business {
    @AliasFor(annotation = Service.class) //다른 애노테이션의 속성에 대한 별칭 설정
    String value() default "";
}
