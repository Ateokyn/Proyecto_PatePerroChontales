/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Kentry Gutter
 */
public class Reservas {

    private int numero_reserva;
    private String estado_reserva;

    public Reservas(int numero_reserva, String estado_reserva) {
        this.numero_reserva = numero_reserva;
        this.estado_reserva = estado_reserva;
    }

    public Reservas(String estado_reserva) {
        this.estado_reserva = estado_reserva;
    }

    public int getNumero_reserva() {
        return numero_reserva;
    }

    public void setNumero_reserva(int numero_reserva) {
        this.numero_reserva = numero_reserva;
    }

    public String getEstado_reserva() {
        return estado_reserva;
    }

    public void setEstado_reserva(String estado_reserva) {
        this.estado_reserva = estado_reserva;
    }

}
