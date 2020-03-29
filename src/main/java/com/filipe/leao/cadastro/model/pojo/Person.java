package com.filipe.leao.cadastro.model.pojo;

import com.filipe.leao.cadastro.model.enums.GenderEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "person")
public class Person extends BaseEntity {

    protected static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    private String name;
    private LocalDate dateOfBirth;
    private String email;
    private String naturalness;
    private String cpf;
    private String nationality;
    private GenderEnum gender;
}
