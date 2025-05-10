package com.javatech.vardhu.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "school_tbl")
//@Table(name = "school_tbl")
@Getter
@Setter

public class SchoolY extends BaseEntity {

    String name;
    String address;
    List<String> DressCodeColor;

}
