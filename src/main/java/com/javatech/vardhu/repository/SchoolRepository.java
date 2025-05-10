package com.javatech.vardhu.repository;

import com.javatech.vardhu.entity.SchoolY;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SchoolRepository extends JpaRepository<SchoolY,Long> {



    Optional<SchoolY> findById(Long aLong);

    Optional<SchoolY> findByIdAndIsDeleted(Long id, int isDeleted);

}
