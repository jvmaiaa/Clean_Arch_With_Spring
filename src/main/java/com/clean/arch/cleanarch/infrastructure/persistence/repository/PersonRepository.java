package com.clean.arch.cleanarch.infrastructure.persistence.repository;

import com.clean.arch.cleanarch.infrastructure.persistence.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
