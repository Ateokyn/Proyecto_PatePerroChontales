/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Kentry Gutter
 */
public class Reservas {

    private int n_reserva;
    private String estado_reserva;
    private Date fecha_reserva;

    public Reservas(int n_reserva, String estado_reserva, java.sql.Date fecha_reserva) {
        this.n_reserva = n_reserva;
        this.estado_reserva = estado_reserva;
        this.fecha_reserva = fecha_reserva;
    }

    public Reservas(String estado_reserva, Date fecha_reserva) {
        this.estado_reserva = estado_reserva;
        this.fecha_reserva = fecha_reserva;
    }

    public int getN_reserva() {
        return n_reserva;
    }

    public void setN_reserva(int n_reserva) {
        this.n_reserva = n_reserva;
    }

    public String getEstado_reserva() {
        return estado_reserva;
    }

    public void setEstado_reserva(String estado_reserva) {
        this.estado_reserva = estado_reserva;
    }

    public Date getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

}
