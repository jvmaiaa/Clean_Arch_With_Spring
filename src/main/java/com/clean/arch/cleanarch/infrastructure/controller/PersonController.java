package com.clean.arch.cleanarch.infrastructure.controller;

import com.clean.arch.cleanarch.application.usecases.CreatePersonCase;
import com.clean.arch.cleanarch.domain.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final CreatePersonCase createPersonCase;

    public PersonController(CreatePersonCase createPersonCase) {
        this.createPersonCase = createPersonCase;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .location(ServletUriComponentsBuilder.fromCurrentRequestUri()
                        .path("/{id}")
                        .buildAndExpand(person.getId())
                        .toUri())
                .body(createPersonCase.execute(person));
    }


}
