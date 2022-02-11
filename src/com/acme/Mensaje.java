package com.acme;

import java.util.Scanner;

public class Mensaje {

    public String solicitaDatos(String mensaje) {
        System.out.println(mensaje);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }

    public void saludar(Persona p) {
        //System.out.println("Hola %s, bienvenido a Java \n", nombre);
        System.out.println("Hola " + p + ", bienvenido a Java \n");
    }
}
