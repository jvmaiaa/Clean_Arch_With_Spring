package com.clean.arch.cleanarch.application.usecases.impl;

import com.clean.arch.cleanarch.application.gateway.PersonGateway;
import com.clean.arch.cleanarch.application.usecases.CreatePersonCase;
import com.clean.arch.cleanarch.domain.Person;

public class CreatePersonCaseImpl implements CreatePersonCase {

    private final PersonGateway personGateway;

    public CreatePersonCaseImpl(PersonGateway personGateway) {
        this.personGateway = personGateway;
    }

    public Person execute(Person person) {
        return personGateway.save(person);
    }
}
