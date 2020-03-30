package com.filipe.leao.cadastro.repository;

import com.filipe.leao.cadastro.model.pojo.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, Long> {

    Optional<Person> findByIdAndRemovedDateIsNull(Long id);

    Optional<Person> findByCpfAndRemovedDateIsNull(String cpf);

    <T> Collection<T> findAllByRemovedDateIsNull(Class<T> type);
}
