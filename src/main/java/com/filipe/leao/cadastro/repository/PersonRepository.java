package com.filipe.leao.cadastro.repository;

import com.filipe.leao.cadastro.model.pojo.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
