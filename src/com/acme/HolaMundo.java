package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        //System.out.println("Hola Mundo!!");
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Escribe tu Nombre: ");
        msg.saludar(nombre);
    }
}
