package com.filipe.leao.cadastro.model.pojo;

import com.filipe.leao.cadastro.model.enums.GenderEnum;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "person")
public class Person extends BaseEntity implements Serializable {

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
