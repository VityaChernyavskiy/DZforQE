package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    private List<Person> personList = new ArrayList<>();

    @GetMapping
    public List<Person> getAllPersons() {
        return personList;
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        String modifiedName = "Привет, " + person.getName() + "!";
        int age = person.getAge();
        person.setName(modifiedName);
        person.setAge(age + 100);
        personList.add(person);
        return person;
    }

    @PutMapping("/{name}")
    public ResponseEntity<?> updatePerson(@PathVariable String name, @RequestBody Person updatedPerson) {
        Person foundPerson = null;
        for (Person person : personList) {
            if (person.getName().equalsIgnoreCase(name)) {

                person.setName(updatedPerson.getName());
                person.setAge(updatedPerson.getAge());
                foundPerson = person;
            }
        }

        if (foundPerson != null) {
            return ResponseEntity.ok(foundPerson);
        } else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Пользователь с именем '" + name + "' не найден.");
        }
    }

}
