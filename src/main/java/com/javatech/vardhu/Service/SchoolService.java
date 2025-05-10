package com.javatech.vardhu.Service;

import com.javatech.vardhu.model.School;

public interface SchoolService {
     School saveSchool(School school);
    School updateSchool(School school) throws Exception;
     School findSchoolById(int schoolId);

  void deleteSchool (int schoolId);


}
