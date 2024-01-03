package com.ri.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ri.entities.PlansEntity;

public interface PlansRepo extends JpaRepository<PlansEntity, Integer> {

}
