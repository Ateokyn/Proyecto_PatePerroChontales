/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class Gira {

     private int ID_GIRA;
    private String NOMBRE_GIRA;
    private double PRECIO_GIRA;
    private double DISTANCIA_GIRA;
    private Date FECHA_GIRA;
    private int ID_EMPLEADO;

    public Gira(int ID_GIRA, String NOMBRE_GIRA, double PRECIO_GIRA, double DISTANCIA_GIRA, Date FECHA_GIRA, int ID_EMPLEADO) {
        this.ID_GIRA = ID_GIRA;
        this.NOMBRE_GIRA = NOMBRE_GIRA;
        this.PRECIO_GIRA = PRECIO_GIRA;
        this.DISTANCIA_GIRA = DISTANCIA_GIRA;
        this.FECHA_GIRA = FECHA_GIRA;
        this.ID_EMPLEADO = ID_EMPLEADO;
    }

    public Gira(String NOMBRE_GIRA, double PRECIO_GIRA, double DISTANCIA_GIRA, Date FECHA_GIRA, int ID_EMPLEADO) {
        this.NOMBRE_GIRA = NOMBRE_GIRA;
        this.PRECIO_GIRA = PRECIO_GIRA;
        this.DISTANCIA_GIRA = DISTANCIA_GIRA;
        this.FECHA_GIRA = FECHA_GIRA;
        this.ID_EMPLEADO = ID_EMPLEADO;
    }

    public int getID_GIRA() {
        return ID_GIRA;
    }

    public void setID_GIRA(int ID_GIRA) {
        this.ID_GIRA = ID_GIRA;
    }

    public String getNOMBRE_GIRA() {
        return NOMBRE_GIRA;
    }

    public void setNOMBRE_GIRA(String NOMBRE_GIRA) {
        this.NOMBRE_GIRA = NOMBRE_GIRA;
    }

    public double getPRECIO_GIRA() {
        return PRECIO_GIRA;
    }

    public void setPRECIO_GIRA(double PRECIO_GIRA) {
        this.PRECIO_GIRA = PRECIO_GIRA;
    }

    public double getDISTANCIA_GIRA() {
        return DISTANCIA_GIRA;
    }

    public void setDISTANCIA_GIRA(double DISTANCIA_GIRA) {
        this.DISTANCIA_GIRA = DISTANCIA_GIRA;
    }

    public Date getFECHA_GIRA() {
        return FECHA_GIRA;
    }

    public void setFECHA_GIRA(Date FECHA_GIRA) {
        this.FECHA_GIRA = FECHA_GIRA;
    }

    public int getID_EMPLEADO() {
        return ID_EMPLEADO;
    }

    public void setID_EMPLEADO(int ID_EMPLEADO) {
        this.ID_EMPLEADO = ID_EMPLEADO;
    }
}