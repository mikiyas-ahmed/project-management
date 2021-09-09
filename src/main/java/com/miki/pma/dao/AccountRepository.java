package com.miki.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.miki.pma.entity.UserAccount;

public interface AccountRepository extends CrudRepository <UserAccount, Long>{

}
