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
public class Detalles_Reserva {

    private int numero_reservaP;
    private int id_pR;
    private Date fecha_reserva;

    public Detalles_Reserva(int numero_reservaP, int id_pR, Date fecha_reserva) {
        this.numero_reservaP = numero_reservaP;
        this.id_pR = id_pR;
        this.fecha_reserva = fecha_reserva;
    }

    public Detalles_Reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public int getNumero_reservaP() {
        return numero_reservaP;
    }

    public void setNumero_reservaP(int nunmeor_reservaP) {
        this.numero_reservaP = nunmeor_reservaP;
    }

    public int getId_pR() {
        return id_pR;
    }

    public void setId_pR(int id_pR) {
        this.id_pR = id_pR;
    }

    public Date getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

}
