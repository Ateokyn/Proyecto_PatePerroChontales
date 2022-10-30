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
public class Telefono_Participante {

    private int id_pT;
    private int id_tipotelP;
    private String telefono;

    public Telefono_Participante(int id_pT, int id_tipotelP, String telefono) {
        this.id_pT = id_pT;
        this.id_tipotelP = id_tipotelP;
        this.telefono = telefono;
    }

    public Telefono_Participante(String telefono) {
        this.telefono = telefono;
    }

    public int getId_pT() {
        return id_pT;
    }

    public void setId_pT(int id_pT) {
        this.id_pT = id_pT;
    }

    public int getId_tipotelP() {
        return id_tipotelP;
    }

    public void setId_tipotelP(int id_tipotelP) {
        this.id_tipotelP = id_tipotelP;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
