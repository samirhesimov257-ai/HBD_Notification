package com.hbd_notification.service;

import com.hbd_notification.dao.entity.EmployeeEnt;
import com.hbd_notification.dao.repository.EmployeeRepo;
import com.hbd_notification.dto.request.EmployeeReqDto;
import com.hbd_notification.mapper.EmployeeMapper;
import com.hbd_notification.util.EmailSender;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepo repo;
    private final EmployeeMapper mapper;
    private final EmailSender sender;

    public static final String message = "ad gununuz mubarak.";


    public void saveEmployee(EmployeeReqDto dto) {
        repo.save(mapper.toEnt(dto));
    }


    @Scheduled(cron = "30 * * * * *")
    private void sendHBDMessage() {
        System.out.println("salam");
        var doi = LocalDate.now();
        var dom = doi.getMonthValue();
        var dod = doi.getDayOfMonth();
        var dof = repo.findByDof(dom,dod);
        for (EmployeeEnt a:dof){
            a.setAge(a.getAge()+1);
            sender.sendMail(a.getEmail(),"Hormetli "+a.getFirstName()+" "+a.getLastName()+" "+message);
            repo.save(a);
        }


    }

}
