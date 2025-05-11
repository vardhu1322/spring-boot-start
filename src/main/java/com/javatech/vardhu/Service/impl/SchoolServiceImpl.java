package com.javatech.vardhu.Service.impl;

import com.javatech.vardhu.Exception.DataNotFoundException;
import com.javatech.vardhu.Service.SchoolService;
import com.javatech.vardhu.entity.SchoolY;
import com.javatech.vardhu.mapper.SchoolMapper;
import com.javatech.vardhu.model.School;
import com.javatech.vardhu.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;


@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    SchoolRepository schoolRepository;

    @Override
    public School saveSchool(School school) {
        SchoolY school1 = new SchoolY();
        school1.setName(school.getName());
       school1.setAddress(school.getName());
       school1.setDressCodeColor(school.getDressCodeColor());
       school1.setCreatedBy("Admin");
       school1.setCreatedDate(Date.valueOf(LocalDate.now()));
        schoolRepository.save(school1);
        school.setId(school1.getId());
        return school;
    }

    @Override
    public School updateSchool(School school) throws Exception {
        Optional<SchoolY> optionalDate = schoolRepository.findByIdAndIsDeleted(school.getId(),0);
        if(optionalDate.isPresent()){
            SchoolY schoolY=optionalDate.get();
            if (!school.getName().isEmpty())
                schoolY.setName(school.getName());
            schoolY.setUpdatedBy("Admin");
            schoolY.setUpdatedDate(Date.valueOf(LocalDate.now()));
            schoolRepository.save(schoolY);
            return SchoolMapper.maptoSchool(schoolY);
        }else
            throw new DataNotFoundException("Record Not Found");
    }

    @Override
    public School findSchoolById(int schoolId) {
        Optional<SchoolY> optionalDate = schoolRepository.findByIdAndIsDeleted((long ) schoolId,0);
        if(optionalDate.isPresent()){
            return SchoolMapper.maptoSchool(optionalDate.get());
        }else
            throw new DataNotFoundException("Record Not Found");

    }

    @Override
    public void deleteSchool(int schoolId) {

        //check where schooid exist or not if exist then delete else throw error
        Optional<SchoolY> optionalDate = schoolRepository.findByIdAndIsDeleted((long ) schoolId,0);
       if(optionalDate.isPresent())
       {
           SchoolY schoolY=optionalDate.get();
           schoolY.setIsDeleted(1);
           schoolRepository.save(schoolY);

       }else
           throw new DataNotFoundException("record Not Found");


    }

}
