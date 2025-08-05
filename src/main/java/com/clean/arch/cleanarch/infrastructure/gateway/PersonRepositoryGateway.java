package com.clean.arch.cleanarch.infrastructure.gateway;

import com.clean.arch.cleanarch.application.gateway.PersonGateway;
import com.clean.arch.cleanarch.domain.Person;
import com.clean.arch.cleanarch.infrastructure.persistence.entity.PersonEntity;
import com.clean.arch.cleanarch.infrastructure.persistence.repository.PersonRepository;
import org.modelmapper.ModelMapper;

public class PersonRepositoryGateway implements PersonGateway {

    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;

    public PersonRepositoryGateway(PersonRepository personRepository,
                                   ModelMapper modelMapper) {
        this.personRepository = personRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Person save(Person person) {
        PersonEntity savedPerson = modelMapper.map(person, PersonEntity.class);
        personRepository.save(savedPerson);
        return modelMapper.map(savedPerson, Person.class);
    }
}
