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
public class Cliente {

    private int id_cliente;
    private String nombre_c;
    private String apellido_c1;
    private String apellido_c2;
    private int edad_c;
    private String depart_c;

    public Cliente(int id_cliente, String nombre_c, String apellido_c1, String apellido_c2, int edad_c, String depart_c) {
        this.id_cliente = id_cliente;
        this.nombre_c = nombre_c;
        this.apellido_c1 = apellido_c1;
        this.apellido_c2 = apellido_c2;
        this.edad_c = edad_c;
        this.depart_c = depart_c;
    }

    public Cliente(String nombre_c, String apellido_c1, String apellido_c2, int edad_c, String depart_c) {
        this.nombre_c = nombre_c;
        this.apellido_c1 = apellido_c1;
        this.apellido_c2 = apellido_c2;
        this.edad_c = edad_c;
        this.depart_c = depart_c;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_c() {
        return nombre_c;
    }

    public void setNombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    public String getApellido_c1() {
        return apellido_c1;
    }

    public void setApellido_c1(String apellido_c1) {
        this.apellido_c1 = apellido_c1;
    }

    public String getApellido_c2() {
        return apellido_c2;
    }

    public void setApellido_c2(String apellido_c2) {
        this.apellido_c2 = apellido_c2;
    }

    public int getEdad_c() {
        return edad_c;
    }

    public void setEdad_c(int edad_c) {
        this.edad_c = edad_c;
    }

    public String getDepart_c() {
        return depart_c;
    }

    public void setDepart_c(String depart_c) {
        this.depart_c = depart_c;
    }

}
