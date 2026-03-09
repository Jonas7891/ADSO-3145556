package com.sena.apiejemplo.IRepository;

import com.sena.apiejemplo.Entity.User;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(Long id);

    List<User> findByName(String name);

    Optional<User> findByEmail(String email);

    Optional<User> findByPassword(String password);
}
