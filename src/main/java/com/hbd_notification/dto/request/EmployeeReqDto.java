package com.hbd_notification.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor

public class EmployeeReqDto {
    private String firstName, lastName, email;
    private Double salary;
    private Integer age;
    private LocalDate dof;
}
