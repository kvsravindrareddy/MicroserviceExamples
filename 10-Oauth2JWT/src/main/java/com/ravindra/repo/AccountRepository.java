package com.ravindra.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ravindra.entity.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{
	Optional<Account> findByUsername(final String username);
}