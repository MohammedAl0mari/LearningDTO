package org.springDTO.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
    @Id
    private long id;
    private String mame;
    private String age;
}
