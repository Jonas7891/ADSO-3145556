package com.sena.apiejemplo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sena.apiejemplo.Entity.Person;
import com.sena.apiejemplo.Service.PersonService;

@RestController
@RequestMapping("/apiejemplo/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAllPerson(){
        return personService.getAllPerson();
    }

    @GetMapping("/searchId")
    public Optional<Person> getPersonById(
        @RequestParam(required = false) Long id) {

        if (id != null) {
            return personService.getPersonById(id);
        }

        return personService.getPersonById(id);
    }

    @GetMapping("/search")
    public List<Person> searchPeople (
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName,
            @RequestParam(required = false) String address,
            @RequestParam(required = false) String phone,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) Boolean status) {

        if (firstName != null) {
            return personService.getPersonByFirstName(firstName);
        }

        if (lastName != null) {
            return personService.getPersonByLastName(lastName);
        }

        if (address != null) {
            return personService.getPersonByAddress(address);
        }

        if (phone != null) {
            return personService.getPersonByPhone(phone);
        }

        if (email != null) {
            return List.of(personService.getPersonByEmail(email).orElse(null));
        }

        if (status != null) {
            return personService.getPersonByStatus(status);
        }

        return personService.getAllPerson();
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return personService.save(person);
    }

    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Long id, @RequestBody Person person){
        return personService.update(id, person);
    }

    @DeleteMapping("/{id}")
    public String deletePerson(@PathVariable Long id){
        personService.delete(id);
        return "Persona eliminada correctamente";
    }
}