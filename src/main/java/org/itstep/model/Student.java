package org.itstep.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    private Integer id;
    private String name;
    private String email;
    private String phone;
    private Group group;


    public Student(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
