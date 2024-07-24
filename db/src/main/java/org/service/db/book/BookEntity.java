package org.service.db.book;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.service.db.BaseEntity;

import java.time.LocalDateTime;

//@Entity
//@Table(name="book")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class BookEntity extends BaseEntity {

    private String title;

    private String review;

    private String status;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;
}
