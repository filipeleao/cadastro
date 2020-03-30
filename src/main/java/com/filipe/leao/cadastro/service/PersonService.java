package com.filipe.leao.cadastro.service;

import com.filipe.leao.cadastro.exception.CPFRegisteredException;
import com.filipe.leao.cadastro.exception.PersonNotFoundException;
import com.filipe.leao.cadastro.model.dto.PersonDTO;
import com.filipe.leao.cadastro.model.pojo.Person;
import com.filipe.leao.cadastro.repository.PersonRepository;
import com.filipe.leao.cadastro.repository.interfaces.PersonInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void save(PersonDTO personDTO) throws CPFRegisteredException {

        if (personRepository.findByCpfAndRemovedDateIsNull(personDTO.getCpf()).isPresent()) {
            throw new CPFRegisteredException();
        }

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

    public void delete(String cpf) throws PersonNotFoundException {

        Person person = personRepository.findByCpfAndRemovedDateIsNull(cpf)
                .orElseThrow(PersonNotFoundException::new);

        person.setRemovedDate(LocalDateTime.now());

        personRepository.save(person);
    }

    public void update(Long id, PersonDTO personDTO) throws PersonNotFoundException {

        Person person = personRepository.findById(id)
                .orElseThrow(PersonNotFoundException::new);

        person.setCpf(personDTO.getCpf());
        person.setName(personDTO.getName());
        person.setNationality(personDTO.getNationality());
        person.setNaturalness(personDTO.getNaturalness());
        person.setGender(personDTO.getGender());
        person.setDateOfBirth(personDTO.getDateOfBirth());

        personRepository.save(person);
    }
}
