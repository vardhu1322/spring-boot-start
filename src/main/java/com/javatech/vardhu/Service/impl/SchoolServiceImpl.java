package com.javatech.vardhu.Service.impl;

import com.javatech.vardhu.Service.SchoolService;
import com.javatech.vardhu.model.School;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class SchoolServiceImpl implements SchoolService {
    @Override
    public School saveSchool(School school) {
        School schoolResponse=school;
        schoolResponse.setId(123);
        return schoolResponse;
    }

    @Override
    public School updateSchool(School school) throws Exception {
        if (school.getId()==0)
            throw new Exception("Id not Exist");
        return school;
    }

    @Override
    public School findSchoolById(int schoolId) {
        School school = new School();
        school.setId(1);
        school.setName("ris");
        String[] colors={"red","blue"} ;
        school.setDressCodeColor(Arrays.asList(colors));
        school.setAddress("BMC");
        return school;
    }

    @Override
    public Map deleteSchool(int schoolId) {
        Map<String,Object>mp=new HashMap<>();
        mp.put("id",schoolId);
        mp.put("Message","Delete");
        return mp;

    }

}
