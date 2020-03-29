package com.filipe.leao.cadastro.model.dto;

import com.filipe.leao.cadastro.model.enums.GenderEnum;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PersonDTO {

    @NotNull(message = "Nome não pode está vazio.")
    private String name;

    @PastOrPresent(message = "Data de nascimento não pode ser maior que hoje.")
    private LocalDate dateOfBirth;

    @Email(message = "Email não válido")
    private String email;

    @NotNull(message = "O CPF não pode ser vazio.")
    @CPF(message = "CPF não válido.")
    private String cpf;

    private String naturalness;
    private String nationality;
    private GenderEnum gender;
}
