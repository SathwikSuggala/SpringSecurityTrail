package com.sathwik.applicationTrail.Security.repository;

import com.sathwik.applicationTrail.Security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDetailsRepository extends JpaRepository<User, Integer> {
    @Query("select u from User u where u.userName = :userName")
    Optional<User> findByUsername(@Param("userName") String userName);

}
