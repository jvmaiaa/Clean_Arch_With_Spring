package com.clean.arch.cleanarch.application.gateway;

import com.clean.arch.cleanarch.domain.Person;

public interface PersonGateway {

    Person save(Person person);
}