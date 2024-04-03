package org.example.modelos;

import org.example.helpers.EvaluarPatron;
import org.example.helpers.PersonaValidacion;

public class Persona {
    //inyecto la dependencia de las validaciones
    private PersonaValidacion valido= new PersonaValidacion();

    private String nombres;
    private  String correo;
    private String edad;

    public Persona() {
    }

    public Persona(String nombres, String correo, String edad) {
        this.nombres = nombres;
        this.correo = correo;
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEdad() {
        return edad;
    }

    public void setNombres(String nombres) {
        try {//intente
            this.valido.validarNombre(nombres);//validar los nombres
            this.nombres=nombres;

        }
        catch (Exception error){
            System.out.printf(error.getMessage());

        }
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
