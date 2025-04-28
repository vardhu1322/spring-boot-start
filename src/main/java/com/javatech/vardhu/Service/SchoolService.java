package com.javatech.vardhu.Service;

import com.javatech.vardhu.model.School;

import java.util.Map;

public interface SchoolService {
     School saveSchool(School school);
    School updateSchool(School school) throws Exception;
     School findSchoolById(int schoolId);

  Map deleteSchool (int schoolId);


}
