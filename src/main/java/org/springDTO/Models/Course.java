package org.springDTO.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Course {
    @Id
    private long id;
    private String name;
    private String cost;
    private String time;
}
