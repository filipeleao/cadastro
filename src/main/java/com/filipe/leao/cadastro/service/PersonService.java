package com.filipe.leao.cadastro.service;

import com.filipe.leao.cadastro.model.dto.PersonDTO;
import com.filipe.leao.cadastro.model.pojo.Person;
import com.filipe.leao.cadastro.repository.PersonRepository;
import com.filipe.leao.cadastro.repository.interfaces.PersonInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void save(PersonDTO personDTO) {

        personRepository.save(Person.builder()
                .naturalness(personDTO.getNaturalness())
                .cpf(personDTO.getCpf())
                .name(personDTO.getName())
                .nationality(personDTO.getNationality())
                .gender(personDTO.getGender())
                .dateOfBirth(personDTO.getDateOfBirth())
                .dateOfBirth(personDTO.getDateOfBirth())
                .build()
        );
    }

    public List<PersonInterface> all() {
        return (List<PersonInterface>) personRepository.findAllByRemovedDateIsNull(PersonInterface.class);
    }

    public void delete(Long id) {

        Optional<Person> personOptional = personRepository.findByIdAndRemovedDateIsNull(id);

        Person person = personOptional.get();
        person.setRemovedDate(LocalDateTime.now());

        personRepository.save(person);
    }

    public void update(Long id, PersonDTO personDTO) {

//        personRepository.findById(id).orElseThrow()

        personRepository.save(Person.builder()
                .naturalness(personDTO.getNaturalness())
                .cpf(personDTO.getCpf())
                .name(personDTO.getName())
                .nationality(personDTO.getNationality())
                .gender(personDTO.getGender())
                .dateOfBirth(personDTO.getDateOfBirth())
                .dateOfBirth(personDTO.getDateOfBirth())
                .build()
        );
    }
}
