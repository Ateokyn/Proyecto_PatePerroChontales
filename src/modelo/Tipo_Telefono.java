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
public class Tipo_Telefono {

    private int id_tipotel;
    private String tipotel;

    public Tipo_Telefono(int id_tipotel, String tipotel) {
        this.id_tipotel = id_tipotel;
        this.tipotel = tipotel;
    }

    public Tipo_Telefono(String tipotel) {
        this.tipotel = tipotel;
    }

    public int getId_tipotel() {
        return id_tipotel;
    }

    public void setId_tipotel(int id_tipotel) {
        this.id_tipotel = id_tipotel;
    }

    public String getTipotel() {
        return tipotel;
    }

    public void setTipotel(String tipotel) {
        this.tipotel = tipotel;
    }

}
