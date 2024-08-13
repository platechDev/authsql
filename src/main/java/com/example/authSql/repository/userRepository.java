package com.example.authSql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.authSql.entity.User;

@Repository()
public interface userRepository extends JpaRepository<User, Long> {

}
