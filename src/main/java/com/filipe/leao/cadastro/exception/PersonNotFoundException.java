package com.filipe.leao.cadastro.exception;

public class PersonNotFoundException extends Exception {
    public PersonNotFoundException() {
        super("Pessoa não encontrada.");
    }
}
