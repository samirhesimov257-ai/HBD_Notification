package com.hbd_notification.dao.repository;

import com.hbd_notification.dao.entity.EmployeeEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEnt, Long> {
//    @Query(value = "SELECT p from dof_employee p where EXTRACT(MONTH(p.dof))=:month and EXTRACT(DAY(p.dof))=:day",nativeQuery = true)
//    List<EmployeeEnt> findByDof(int month,int day);
@Query(value = "SELECT * FROM dof_employee WHERE EXTRACT(MONTH FROM dof) = :month AND EXTRACT(DAY FROM dof) = :day", nativeQuery = true)
List<EmployeeEnt> findByDof( int month,  int day);
}
