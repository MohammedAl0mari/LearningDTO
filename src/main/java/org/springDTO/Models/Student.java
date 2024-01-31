package org.springDTO.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Student {
    @Id
    private long id;
    private String name;
    private String age;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "student")
    private List<Course> courses;
}
