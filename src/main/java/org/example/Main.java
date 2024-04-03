package org.example;

import org.example.modelos.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //como uso la clse persona
        Persona objeto=new Persona();

        Scanner lee = new Scanner(System.in);
        System.out.println("digite su nombre");
        objeto.setNombres(lee.nextLine());

    }
}