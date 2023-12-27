package com.ravismishra99.AuthenticationApp.respository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ravismishra99.AuthenticationApp.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

  Optional<User> findByEmail(String username);
  
}