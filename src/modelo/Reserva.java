/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class Reserva {

    private int N_RESERVA;
    private Date FECHA_RESERVA;
    private int ID_GIRA;
    private int ID_CLIENTE;

    public Reserva(int N_RESERVA, Date FECHA_RESERVA, int ID_GIRA, int ID_CLIENTE) {
        this.N_RESERVA = N_RESERVA;
        this.FECHA_RESERVA = FECHA_RESERVA;
        this.ID_GIRA = ID_GIRA;
        this.ID_CLIENTE = ID_CLIENTE;
    }

    public Reserva(Date FECHA_RESERVA, int ID_GIRA, int ID_CLIENTE) {
        this.FECHA_RESERVA = FECHA_RESERVA;
        this.ID_GIRA = ID_GIRA;
        this.ID_CLIENTE = ID_CLIENTE;
    }

    public int getN_RESERVA() {
        return N_RESERVA;
    }

    public void setN_RESERVA(int N_RESERVA) {
        this.N_RESERVA = N_RESERVA;
    }

    public Date getFECHA_RESERVA() {
        return FECHA_RESERVA;
    }

    public void setFECHA_RESERVA(Date FECHA_RESERVA) {
        this.FECHA_RESERVA = FECHA_RESERVA;
    }

    public int getID_GIRA() {
        return ID_GIRA;
    }

    public void setID_GIRA(int ID_GIRA) {
        this.ID_GIRA = ID_GIRA;
    }

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

}
