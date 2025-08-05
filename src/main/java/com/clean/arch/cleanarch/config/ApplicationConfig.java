package com.clean.arch.cleanarch.config;

import com.clean.arch.cleanarch.application.gateway.PersonGateway;
import com.clean.arch.cleanarch.application.usecases.impl.CreatePersonCaseImpl;
import com.clean.arch.cleanarch.infrastructure.gateway.PersonRepositoryGateway;
import com.clean.arch.cleanarch.infrastructure.persistence.repository.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    PersonRepositoryGateway personRepositoryGateway(PersonRepository personRepository,
                                                    ModelMapper modelMapper){
        return new PersonRepositoryGateway(personRepository, modelMapper);
    }

    @Bean
    CreatePersonCaseImpl createPersonCaseImpl(PersonGateway personGateway) {
        return new CreatePersonCaseImpl(personGateway);
    }
}
