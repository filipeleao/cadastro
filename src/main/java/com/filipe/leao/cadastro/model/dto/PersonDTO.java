package com.filipe.leao.cadastro.model.dto;

import com.filipe.leao.cadastro.model.enums.GenderEnum;

import java.time.LocalDate;

public class PersonDTO {

    private String name;
    private LocalDate dateOfBirth;
    private String email;
    private String naturalness;
    private String cpf;
    private String nationality;
    private GenderEnum gender;
}
