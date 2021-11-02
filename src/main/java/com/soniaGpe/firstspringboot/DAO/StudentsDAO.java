package com.soniaGpe.firstspringboot.DAO;
import  com.soniaGpe.firstspringboot.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsDAO extends JpaRepository<Student , Integer>{

}
