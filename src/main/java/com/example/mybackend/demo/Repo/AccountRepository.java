package com.example.mybackend.demo.Repo;

import com.example.mybackend.demo.entity.Data.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {
    Account findAccountByUsername(String username);

}
