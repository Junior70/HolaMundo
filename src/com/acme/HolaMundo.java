package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        //System.out.println("Hola Mundo!!");
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Escribe tu nombre: ");
        String apellidos = msg.solicitaDatos("Escribe tu apellido: ");
        Persona p1 = new Persona(nombre, apellidos);
        msg.saludar(p1);
    }
}
