package com.javatech.vardhu.controller;
import com.javatech.vardhu.model.School;

import com.javatech.vardhu.Service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SchoolController {


    @Autowired
    private SchoolService schoolService;

//    @GetMapping(value = "/school")
//    public School getSchoolDetails() {
//        return schoolService.findSchoolById(1);
//
//    }

    //    @GetMapping(value = "/school/{schoolId}")
//    public ResponseEntity<?> getSchoolDetailsWith(@PathVariable int SchoolId) {
//        return new ResponseEntity<>(schoolService.findSchoolById(), HttpStatus.FOUND);
//    }
    @GetMapping(value = "/school")
    public ResponseEntity<?> GetSchoolDetails() {
        return new ResponseEntity<>(schoolService.findSchoolById(1), HttpStatus.OK);
    }

//    @GetMapping(value = "/school/{schoolId}")
//    public ResponseEntity<?> GetSchoolDetailsPath(@PathVariable int schoolId) {
//        return new ResponseEntity<>(schoolService.findSchoolById(schoolId), HttpStatus.OK);
//    }

    @GetMapping(value = "/school1")
    public ResponseEntity<?> GetSchoolDetailsParam(@RequestParam(value = "schoolId", required = false) int schoolId) {
        return new ResponseEntity<>(schoolService.findSchoolById(schoolId), HttpStatus.OK);

    }

    @PostMapping("/school")
    public School CreateSchool1(@RequestBody School school) {
        return schoolService.saveSchool(school);

    }

    @DeleteMapping(value="/school/{schoolId}")
    public ResponseEntity<?> deleteSchool(@PathVariable int schoolId) {
        return new ResponseEntity<>(schoolService.deleteSchool(schoolId), HttpStatus.OK);
    }

    @PutMapping("/school")
    public ResponseEntity<?> UpdateSchool(@RequestBody School school) throws Exception {
        return new ResponseEntity<>(schoolService.updateSchool(school), HttpStatus.OK);

    }

}


