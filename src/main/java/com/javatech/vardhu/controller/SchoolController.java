package com.javatech.vardhu.controller;

import com.javatech.vardhu.Service.SchoolService;
import com.javatech.vardhu.model.ResponseDto;
import com.javatech.vardhu.model.School;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@Tag(name = "school controller",description = "This is used to perform crud operation on school")
@RequestMapping(value = "/school")
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
//    @Operation(summary = "Fetch the school details by school id",description = "fetch the school details")
//    @GetMapping(value = "/{schoolId}")
//    public ResponseEntity<?> GetSchoolDetails() {
//        return new ResponseEntity<>( ResponseDto.builder().statusCode(HttpStatus.OK.value()).message("fetch data").data(schoolService.findSchoolById(1)).build(),HttpStatus.OK);
//
//    }

//    @GetMapping(value = "/school/{schoolId}")
//    public ResponseEntity<?> GetSchoolDetailsPath(@PathVariable int schoolId) {
//        return new ResponseEntity<>(schoolService.findSchoolById(schoolId), HttpStatus.OK);
//    }

    @GetMapping
    public ResponseEntity<?> GetSchool(@RequestParam(value = "schoolId", required = false) int schoolId) {
        return new ResponseEntity<>( ResponseDto.builder().statusCode(HttpStatus.OK.value()).message("fetch data successfully").data(schoolService.findSchoolById(schoolId)).build(),HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<?> CreateSchool(@RequestBody School request) {
        return new ResponseEntity<>(ResponseDto.builder().statusCode(HttpStatus.OK.value()).message("Update Succesfully").data(schoolService.saveSchool(request)).build(),HttpStatus.OK);

    }

    @DeleteMapping(value="/{schoolId}")
    public ResponseEntity<?> deleteSchool(@PathVariable int schoolId) {
        schoolService.deleteSchool(schoolId);

        return new ResponseEntity<>( ResponseDto.builder().statusCode(HttpStatus.OK.value()).message("Record Deleted").build(),HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> UpdateSchool(@RequestBody School school) throws Exception {
        return new ResponseEntity<>( ResponseDto.builder().statusCode(HttpStatus.OK.value()).message("Record updated").data(schoolService.updateSchool(school)).build(),HttpStatus.OK);

    }

}



