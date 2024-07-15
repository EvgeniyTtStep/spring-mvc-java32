package org.itstep.model;

import lombok.*;
import org.hibernate.type.LocalDateType;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class Group {

    private Integer id;
    private String name;
    private String date;

    Set<Student> students;



    public Group(String name, String date) {
        this.name = name;
        this.date = date;
    }
}
