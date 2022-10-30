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
public class Lista_Participantes {

    private int numero_list;
    private String estado_p;
    private String estado_deposito;
    private String estado_transporte;

    public Lista_Participantes(int numero_list, String estado_p, String estado_deposito, String estado_transporte) {
        this.numero_list = numero_list;
        this.estado_p = estado_p;
        this.estado_deposito = estado_deposito;
        this.estado_transporte = estado_transporte;
    }

    public Lista_Participantes(String estado_p, String estado_deposito, String estado_transporte) {
        this.estado_p = estado_p;
        this.estado_deposito = estado_deposito;
        this.estado_transporte = estado_transporte;
    }

    public int getNumero_list() {
        return numero_list;
    }

    public void setNumero_list(int numero_list) {
        this.numero_list = numero_list;
    }

    public String getEstado_p() {
        return estado_p;
    }

    public void setEstado_p(String estado_p) {
        this.estado_p = estado_p;
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

}
