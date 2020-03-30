package com.filipe.leao.cadastro.repository.interfaces;

import com.filipe.leao.cadastro.model.enums.GenderEnum;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;

public interface PersonInterface {

    @Value("#{target.cpf}")
    String getCpf();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.dateOfBirth}")
    LocalDate getDateOfBirth();

    @Value("#{target.email}")
    String getEmail();

    @Value("#{target.naturalness}")
    String getNaturalness();

    @Value("#{target.nationality}")
    String getNationality();

    @Value("#{target.gender}")
    GenderEnum getGender();
}
