package com.srm.store_demo.user;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    Optional<UserEntity> findByEmail(String email);
}
