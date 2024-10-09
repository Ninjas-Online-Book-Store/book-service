package dev.codeninjas.book.service.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    @Id
    @Generated
    private String id;
    private String title;
    private String author;
    private String price;
    private String availability;
    private LocalDate createdDate;
    private LocalDate updatedDate;
}
