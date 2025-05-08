package com.javatech.vardhu.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseEntity {
    Date createdDate;

    String createdBy;

    Date updatedDate;

    String updatedBy;
}
