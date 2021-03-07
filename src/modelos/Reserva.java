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
public class Reserva {

    private String nombre;
    private String telefono;
    private TipoReserva reserva;
    private TipoCocina tipoCocina;
    private Integer numeroJornadas;
    private Integer numeroPersonas;
    private String fechaReserva;
    private Boolean requiereHabitacion;
    private String tipoMesa;
    private Integer comensalesMesa;  

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    
   
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TipoReserva getReserva() {
        return reserva;
    }

    public void setReserva(TipoReserva reserva) {
        this.reserva = reserva;
    }

    public TipoCocina getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(TipoCocina tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public Integer getNumeroJornadas() {
        return numeroJornadas;
    }

    public void setNumeroJornadas(Integer numeroJornadas) {
        this.numeroJornadas = numeroJornadas;
    }

    public Boolean getRequiereHabitacion() {
        return requiereHabitacion;
    }

    public void setRequiereHabitacion(Boolean requiereHabitacion) {
        this.requiereHabitacion = requiereHabitacion;
    }

    public String getTipoMesa() {
        return tipoMesa;
    }

    public void setTipoMesa(String tipoMesa) {
        this.tipoMesa = tipoMesa;
    }

    public Integer getComensalesMesa() {
        return comensalesMesa;
    }

    public void setComensalesMesa(Integer comensalesMesa) {
        this.comensalesMesa = comensalesMesa;
    }

    public Integer getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(Integer numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    
}
