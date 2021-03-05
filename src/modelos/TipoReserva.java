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
public enum TipoReserva {
    BANQUETE("Banquete"),
    JORNADA("Jornada"),
    CONGRESO("Congreso");
    
    private String nombre;

    private TipoReserva(String nombre) {
        this.nombre = nombre;
    }

    public static TipoReserva getBANQUETE() {
        return BANQUETE;
    }

    public static TipoReserva getJORNADA() {
        return JORNADA;
    }

    public static TipoReserva getCONGRESO() {
        return CONGRESO;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
}
