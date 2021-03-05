/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author elena
 */
public enum TipoCocina {
    NO_PRECISA("No precisa"),
    BUFFET("Buffet"),
    CARTA("Carta"),
    CHEF("Pedir cita con el chef");
    
    private String nombre;

    private TipoCocina(String nombre) {
        this.nombre = nombre;
    }

    public static TipoCocina getNO_PRECISA() {
        return NO_PRECISA;
    }

    public static TipoCocina getBUFFET() {
        return BUFFET;
    }

    public static TipoCocina getCARTA() {
        return CARTA;
    }

    public static TipoCocina getCHEF() {
        return CHEF;
    }


    public String getNombre() {
        return nombre;
    }
    
    
    
    
}
