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
public class Detalles_Gira {

    private int id_giraP;
    private int id_pG;
    private Date fecha_inscripcionl;

    public Detalles_Gira(int id_giraP, int id_pG, Date fecha_inscripcionl) {
        this.id_giraP = id_giraP;
        this.id_pG = id_pG;
        this.fecha_inscripcionl = fecha_inscripcionl;
    }

    public Detalles_Gira(Date fecha_inscripcionl) {
        this.fecha_inscripcionl = fecha_inscripcionl;
    }

    public int getId_giraP() {
        return id_giraP;
    }

    public void setId_giraP(int id_giraP) {
        this.id_giraP = id_giraP;
    }

    public int getId_pG() {
        return id_pG;
    }

    public void setId_pG(int id_pG) {
        this.id_pG = id_pG;
    }

    public Date getFecha_inscripcionl() {
        return fecha_inscripcionl;
    }

    public void setFecha_inscripcionl(Date fecha_inscripcionl) {
        this.fecha_inscripcionl = fecha_inscripcionl;
    }

}
