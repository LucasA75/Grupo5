package com.javaspringboot.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.javaspringboot.spring.model.User;
// el crud repository se ocupa para trabajar con las bases de datos de manera
//mas eficiente, con funcionas ya prehechas
public interface UserRepository extends CrudRepository<User,Integer>{
    
}
