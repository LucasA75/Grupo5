package com.javaspringboot.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspringboot.spring.model.Buysell;

public interface BuySellRepository extends JpaRepository<Buysell,Integer> {
    
}
