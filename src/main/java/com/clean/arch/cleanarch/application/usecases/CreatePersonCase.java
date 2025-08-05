package com.clean.arch.cleanarch.application.usecases;

import com.clean.arch.cleanarch.domain.Person;

public interface CreatePersonCase {

    Person execute(Person person);
}
