package com.acme;

public record PersonaRegistro(String nombre, String apellidos) {

    @Override
    public String toString() {
        //JUnior comento la liena de codigo que se considera se pueda eliminar
        System.out.println("Esta instruccion es inservible");
        return "%s %s".formatted(nombre, apellidos);
    }
}
