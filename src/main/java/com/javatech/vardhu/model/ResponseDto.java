package com.javatech.vardhu.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Builder
@Data
@Getter
@Setter
public class ResponseDto<T>{
    Integer statusCode;
    String message;
    T data;
    List<T>listData;

}
