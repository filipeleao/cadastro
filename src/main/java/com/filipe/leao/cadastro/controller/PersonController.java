package com.filipe.leao.cadastro.controller;

import com.filipe.leao.cadastro.model.dto.PersonDTO;
import com.filipe.leao.cadastro.repository.interfaces.PersonInterface;
import com.filipe.leao.cadastro.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.ws.rs.core.Response;


import java.util.List;
import java.util.Objects;

@RestController
@CrossOrigin(origins = "*.//*/*", maxAge = 3600)
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/save")
    public Response save(@Valid @RequestBody PersonDTO person) {

        if (Objects.isNull(person)) {
            return Response.noContent().build();
        }

        personService.save(person);
        return Response.ok().build();
    }

    @PutMapping("/update/{id}")
    public Response update(@PathVariable Long id, @Valid @RequestBody PersonDTO person) {

        if (Objects.isNull(person) || Objects.isNull(id)) {
            return Response.noContent().build();
        }
        personService.update(id, person);

        return Response.ok().build();
    }

    @GetMapping("/all")
    public List<PersonInterface> all() {
        return personService.all();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        personService.delete(id);
    }
}







