package com.filipe.leao.cadastro.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenderEnum {

    MALE("M", "Masculino"),
    FEMALE("F", "Femenino");

    private String code;
    private String value;
}
