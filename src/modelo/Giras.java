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
public class Giras {

    private int id_gira;
    private String nombre_gira;
    private float precio_gira;
    private float distancia_gira;
    private Date fecha_gira;
    private int id_emplG;

    public Giras(int id_gira, String nombre_gira, float precio_gira, float distancia_gira, Date fecha_gira, int id_emplG) {
        this.id_gira = id_gira;
        this.nombre_gira = nombre_gira;
        this.precio_gira = precio_gira;
        this.distancia_gira = distancia_gira;
        this.fecha_gira = fecha_gira;
        this.id_emplG = id_emplG;
    }

    public Giras(String nombre_gira, float precio_gira, float distancia_gira, Date fecha_gira, int id_emplG) {
        this.nombre_gira = nombre_gira;
        this.precio_gira = precio_gira;
        this.distancia_gira = distancia_gira;
        this.fecha_gira = fecha_gira;
        this.id_emplG = id_emplG;
    }

    public int getId_gira() {
        return id_gira;
    }

    public void setId_gira(int id_gira) {
        this.id_gira = id_gira;
    }

    public String getNombre_gira() {
        return nombre_gira;
    }

    public void setNombre_gira(String nombre_gira) {
        this.nombre_gira = nombre_gira;
    }

    public float getPrecio_gira() {
        return precio_gira;
    }

    public void setPrecio_gira(float precio_gira) {
        this.precio_gira = precio_gira;
    }

    public float getDistancia_gira() {
        return distancia_gira;
    }

    public void setDistancia_gira(float distancia_gira) {
        this.distancia_gira = distancia_gira;
    }

    public Date getFecha_gira() {
        return fecha_gira;
    }

    public void setFecha_gira(Date fecha_gira) {
        this.fecha_gira = fecha_gira;
    }

    public int getId_emplG() {
        return id_emplG;
    }

    public void setId_emplG(int id_emplG) {
        this.id_emplG = id_emplG;
    }

}
