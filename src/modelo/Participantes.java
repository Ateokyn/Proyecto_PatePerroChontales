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
public class Participantes {

    private int numero_list;
    private String nombre_part;
    private String estado_part;
    private String estado_deposito;
    private String estado_transporte;
    private int edad_part;

    public Participantes(int numero_list, String nombre_part, String estado_part, String estado_deposito, String estado_transporte, int edad_part) {
        this.numero_list = numero_list;
        this.nombre_part = nombre_part;
        this.estado_part = estado_part;
        this.estado_deposito = estado_deposito;
        this.estado_transporte = estado_transporte;
        this.edad_part = edad_part;
    }

    public Participantes(String nombre_part, String estado_part, String estado_deposito, String estado_transporte, int edad_part) {
        this.nombre_part = nombre_part;
        this.estado_part = estado_part;
        this.estado_deposito = estado_deposito;
        this.estado_transporte = estado_transporte;
        this.edad_part = edad_part;
    }

    public int getNumero_list() {
        return numero_list;
    }

    public void setNumero_list(int numero_list) {
        this.numero_list = numero_list;
    }

    public String getNombre_part() {
        return nombre_part;
    }

    public void setNombre_part(String nombre_part) {
        this.nombre_part = nombre_part;
    }

    public String getEstado_part() {
        return estado_part;
    }

    public void setEstado_part(String estado_part) {
        this.estado_part = estado_part;
    }

    public String getEstado_deposito() {
        return estado_deposito;
    }

    public void setEstado_deposito(String estado_deposito) {
        this.estado_deposito = estado_deposito;
    }

    public String getEstado_transporte() {
        return estado_transporte;
    }

    public void setEstado_transporte(String estado_transporte) {
        this.estado_transporte = estado_transporte;
    }

    public int getEdad_part() {
        return edad_part;
    }

    public void setEdad_part(int edad_part) {
        this.edad_part = edad_part;
    }

}
