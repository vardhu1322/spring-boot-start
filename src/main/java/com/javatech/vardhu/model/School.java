package com.javatech.vardhu.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
public class School {
    Long id;

   String name;

   String address;

   List<String>DressCodeColor;

    Date createdDate;

    String createdBy;

    Date updatedDate;

    String updatedBy;


}
