package com.ri.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ri.entities.AccountsEntity;

public interface AccountRepo extends JpaRepository<AccountsEntity, Integer> {

}
