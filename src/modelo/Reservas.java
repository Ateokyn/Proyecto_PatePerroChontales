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
    private int id_clienteR;
    private int id_reservagira;

    public Reservas(int n_reserva, String estado_reserva, Date fecha_reserva, int id_clienteR, int id_reservagira) {
        this.n_reserva = n_reserva;
        this.estado_reserva = estado_reserva;
        this.fecha_reserva = fecha_reserva;
        this.id_clienteR = id_clienteR;
        this.id_reservagira = id_reservagira;
    }

    public Reservas(String estado_reserva, Date fecha_reserva, int id_clienteR, int id_reservagira) {
        this.estado_reserva = estado_reserva;
        this.fecha_reserva = fecha_reserva;
        this.id_clienteR = id_clienteR;
        this.id_reservagira = id_reservagira;
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

    public int getId_clienteR() {
        return id_clienteR;
    }

    public void setId_clienteR(int id_clienteR) {
        this.id_clienteR = id_clienteR;
    }

    public int getId_reservagira() {
        return id_reservagira;
    }

    public void setId_reservagira(int id_reservagira) {
        this.id_reservagira = id_reservagira;
    }

    
}
