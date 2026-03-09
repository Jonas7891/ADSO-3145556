package com.sena.apiejemplo.IRepository;

import com.sena.apiejemplo.Entity.Person;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findById(Long id);

    List<Person> findByFirstName(String firstName);

    List<Person> findByLastName(String lastName);

    List<Person> findByAddress(String address);

    List<Person> findByPhone(String phone);

    Optional<Person> findByEmail(String email);

    List<Person> findByStatus(Boolean status);

}