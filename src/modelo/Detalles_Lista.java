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
public class Detalles_Lista {

    private int numero_listP;
    private int id_pL;
    private Date fecha_registro;

    public Detalles_Lista(int numero_listP, int id_pL, Date fecha_registro) {
        this.numero_listP = numero_listP;
        this.id_pL = id_pL;
        this.fecha_registro = fecha_registro;
    }

    public Detalles_Lista(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public int getNumero_listP() {
        return numero_listP;
    }

    public void setNumero_listP(int numero_listP) {
        this.numero_listP = numero_listP;
    }

    public int getId_pL() {
        return id_pL;
    }

    public void setId_pL(int id_pL) {
        this.id_pL = id_pL;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

}
