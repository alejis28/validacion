package org.example.helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EvaluarPatron {
    public EvaluarPatron() {
    }

    //metodo para evaluar patrones entre un string y un regex en java
    public boolean evaluarPatron(String cadenax,String cualquierRegex) {
        Pattern patron = Pattern.compile(cualquierRegex);
        Matcher concidencia = patron.matcher(cadenax);
        if (concidencia.matches()) {//si conciden
            return true;
        }else {
            return false;
        }
    }
}
