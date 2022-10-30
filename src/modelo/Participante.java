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
public class Participante {

    private int id_p;
    private String nombre_p;
    private String apellido_p1;
    private String apellido_p2;
    private int edad_p;
    private String departamento_p;

    public Participante(int id_p, String nombre_p, String apellido_p1, String apellido_p2, int edad_p, String departamento_p) {
        this.id_p = id_p;
        this.nombre_p = nombre_p;
        this.apellido_p1 = apellido_p1;
        this.apellido_p2 = apellido_p2;
        this.edad_p = edad_p;
        this.departamento_p = departamento_p;
    }

    public Participante(String nombre_p, String apellido_p1, String apellido_p2, int edad_p, String departamento_p) {
        this.nombre_p = nombre_p;
        this.apellido_p1 = apellido_p1;
        this.apellido_p2 = apellido_p2;
        this.edad_p = edad_p;
        this.departamento_p = departamento_p;
    }

    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public String getApellido_p1() {
        return apellido_p1;
    }

    public void setApellido_p1(String apellido_p1) {
        this.apellido_p1 = apellido_p1;
    }

    public String getApellido_p2() {
        return apellido_p2;
    }

    public void setApellido_p2(String apellido_p2) {
        this.apellido_p2 = apellido_p2;
    }

    public int getEdad_p() {
        return edad_p;
    }

    public void setEdad_p(int edad_p) {
        this.edad_p = edad_p;
    }

    public String getDepartamento_p() {
        return departamento_p;
    }

    public void setDepartamento_p(String departamento_p) {
        this.departamento_p = departamento_p;
    }

}
