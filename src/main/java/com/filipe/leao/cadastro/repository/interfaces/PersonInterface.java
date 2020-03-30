package com.filipe.leao.cadastro.repository.interfaces;

import com.filipe.leao.cadastro.model.enums.GenderEnum;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;
import java.util.UUID;

public interface PersonInterface {

    @Value("#{target.uuid}")
    UUID getUUID();

    @Value("#{target.cnpjcpf}")
    String getCpf();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.date_of_birth}")
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
