package com.hbd_notification.mapper;

import com.hbd_notification.dao.entity.EmployeeEnt;
import com.hbd_notification.dto.request.EmployeeReqDto;
import org.hibernate.annotations.MapKeyCompositeType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeEnt toEnt(EmployeeReqDto dto);
}
