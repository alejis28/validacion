package org.example.helpers;

public class PersonaValidacion {
    //inlletar la de pendencia de la clase evalualr patron
    //inlletar la de pendencia es crear un objeto de la clse que quiero traer

    private EvaluarPatron EvaluadorDeconcidencia = new EvaluarPatron();

    public boolean validarNombre(String nombre) throws Exception {
        //nesecito que el nombre solo tenga letras y espacios
        //y que no tenga mas de 50 caracteres
        String exprecionRegular = "^[A-Za-z\\s]+$";


        if (!this.EvaluadorDeconcidencia.evaluarPatron(nombre, exprecionRegular)) {
            throw new Exception("revise el nombre ingresado solo pude tener letrs y espacios ");

        }
        return true;


    }


    public boolean validarCorreo(String correo) throws Exception {
        //valido si el nombre conside con la esprecion regular
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (!this.EvaluadorDeconcidencia.evaluarPatron(correo, regex)) {
            throw new Exception("revose el correo");

        }
        return true;
    }

    public boolean validarEdad(String edad) throws Exception {
        String edades = "^[1-9]\\d*$";
        if (this.EvaluadorDeconcidencia.evaluarPatron(edad,edades)){

            throw new Exception("formato inccorreto");


        }
        return true;
    }

}
