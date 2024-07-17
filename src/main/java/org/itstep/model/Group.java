package org.itstep.model;

import lombok.*;
import org.hibernate.type.LocalDateType;
import org.springframework.stereotype.Component;

import javax.persistence.*;
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
@Entity
@Table(name = "team")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_group")
    private Integer id;
    private String name;
    private String date;

    @OneToMany(mappedBy = "group", fetch = FetchType.EAGER)
    Set<Student> students;



    public Group(String name, String date) {
        this.name = name;
        this.date = date;
    }
}
