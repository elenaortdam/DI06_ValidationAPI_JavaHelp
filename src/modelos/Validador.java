/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author elena
 */
public class Validador {

    public boolean validarNombre(String nombre) {
       
        boolean valido = false;
        if(nombre == null || nombre.isEmpty()){
            return valido;
        }
        try {
            Pattern pat = Pattern.compile("^[A-Za-zÁÉÍÓÚñáéíóúÑ]{0,}$");
            Matcher matcher = pat.matcher(nombre);
            valido = matcher.find();
        } catch (Exception ignored) {
        }
        return valido;
    }

    public boolean validarTelefono(String telefono) {
        boolean valido = true;
        if (telefono == null || telefono.isEmpty()) {
            return !valido;
        }
        if(telefono.length() < 9){
            return !valido;
        }
        try {
            Pattern pat = Pattern.compile("^(0034|\\+34)?(\\d\\d\\d)-? ?(\\d\\d)-? ?(\\d)-? ?(\\d)-? ?(\\d\\d)$");
            Matcher matcher = pat.matcher(telefono);
            valido = matcher.find();
        //Si hay alguna excepción la ignoramos y devolvemos que no es válido
        } catch (Exception ignored) {
        }
        return valido;
    }

}
