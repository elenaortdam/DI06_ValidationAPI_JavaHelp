/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.tabla;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import modelos.Reserva;
import modelos.TipoCocina;
import modelos.TipoReserva;

/**
 *
 * @author elena
 */
public class ReservaTableModel extends AbstractTableModel {

    List<Reserva> reservas = new ArrayList<>();
    
    private String[] columnas = {"Nombre", "Teléfono", "Evento", "Fecha", "Cocina", "Personas"};

    public ReservaTableModel(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void addReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    @Override
    public int getRowCount() {
        return this.reservas.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return this.reservas.get(rowIndex).getNombre();
            case 1:
                return this.reservas.get(rowIndex).getTelefono();
            case 2:
                return this.reservas.get(rowIndex).getReserva();
            case 3:
                return this.reservas.get(rowIndex).getFechaReserva();
            case 4:
                return this.reservas.get(rowIndex).getTipoCocina();
            case 5:
                return this.reservas.get(rowIndex).getNumeroPersonas();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

}
