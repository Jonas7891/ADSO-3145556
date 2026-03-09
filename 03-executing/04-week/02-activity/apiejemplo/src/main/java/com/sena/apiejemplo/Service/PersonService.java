package com.sena.apiejemplo.Service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.apiejemplo.Entity.Person;
import com.sena.apiejemplo.IRepository.IPersonRepository;

@Service
public class PersonService {
    @Autowired
    private IPersonRepository personRepository;

    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(Long id) {
        return personRepository.findById(id);
    }

    public List<Person> getPersonByFirstName(String firstName) {
        return personRepository.findByFirstName(firstName);
    }

    public List<Person> getPersonByLastName(String lastName) {
        return personRepository.findByLastName(lastName);
    }

    public List<Person> getPersonByAddress(String address) {
        return personRepository.findByAddress(address);
    }

    public List<Person> getPersonByPhone(String phone) {
        return personRepository.findByPhone(phone);
    }

    public Optional<Person> getPersonByEmail(String email) {
        return personRepository.findByEmail(email);
    }

    public List<Person> getPersonByStatus(Boolean status) {
        return personRepository.findByStatus(status);
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public Person update(Long id, Person person) {
        Optional<Person> personData = personRepository.findById(id);

        if (personData.isPresent()) {
            Person existingPerson = personData.get();

            existingPerson.setFirstName(person.getFirstName());
            existingPerson.setLastName(person.getLastName());
            existingPerson.setAddress(person.getAddress());
            existingPerson.setPhone(person.getPhone());
            existingPerson.setEmail(person.getEmail());
            existingPerson.setStatus(person.getStatus());
            existingPerson.setUpdatedAt(person.getUpdatedAt());
            existingPerson.setUpdatedBy(person.getUpdatedBy());

            return personRepository.save(existingPerson);
        }

        return null;
    }

    public void delete(Long id) {
        personRepository.deleteById(id);
    }

}