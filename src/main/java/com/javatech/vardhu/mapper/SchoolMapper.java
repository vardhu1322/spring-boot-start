package com.javatech.vardhu.mapper;

import com.javatech.vardhu.entity.SchoolY;
import com.javatech.vardhu.model.School;

public class SchoolMapper {
    public static School maptoSchool(SchoolY schoolY){
        return School.builder().name(schoolY.getName()).id(schoolY.getId()).address(schoolY.getAddress()).DressCodeColor(schoolY.getDressCodeColor()).createdBy(schoolY.getCreatedBy()).updatedBy(schoolY.getUpdatedBy()).createdDate(schoolY.getCreatedDate()).build();

    }


}
