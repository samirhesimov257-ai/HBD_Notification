package com.hbd_notification.controller;

import com.hbd_notification.dto.request.EmployeeReqDto;
import com.hbd_notification.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/HBD")
@RequiredArgsConstructor
public class EmployeeCont {
    private final EmployeeService service ;

    @PostMapping
    public void addEmployee(EmployeeReqDto dto){
        service.saveEmployee(dto);
    }
}
