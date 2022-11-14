/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Participante {

    private int NUMERO_LIST;
    private String NOMBRE_PART;
    private String ESTADO_PARTICIPANTE;
    private String ESTADO_DEPOSITO;
    private String ESTADO_TRANSPORTE;
    private int EDAD_PART;
    private int N_RESERVA;

    public Participante(int NUMERO_LIST, String NOMBRE_PART, String ESTADO_PARTICIPANTE, String ESTADO_DEPOSITO, String ESTADO_TRANSPORTE, int EDAD_PART, int N_RESERVA) {
        this.NUMERO_LIST = NUMERO_LIST;
        this.NOMBRE_PART = NOMBRE_PART;
        this.ESTADO_PARTICIPANTE = ESTADO_PARTICIPANTE;
        this.ESTADO_DEPOSITO = ESTADO_DEPOSITO;
        this.ESTADO_TRANSPORTE = ESTADO_TRANSPORTE;
        this.EDAD_PART = EDAD_PART;
        this.N_RESERVA = N_RESERVA;
    }

    public Participante(String NOMBRE_PART, String ESTADO_PARTICIPANTE, String ESTADO_DEPOSITO, String ESTADO_TRANSPORTE, int EDAD_PART, int N_RESERVA) {
        this.NOMBRE_PART = NOMBRE_PART;
        this.ESTADO_PARTICIPANTE = ESTADO_PARTICIPANTE;
        this.ESTADO_DEPOSITO = ESTADO_DEPOSITO;
        this.ESTADO_TRANSPORTE = ESTADO_TRANSPORTE;
        this.EDAD_PART = EDAD_PART;
        this.N_RESERVA = N_RESERVA;
    }

    public int getNUMERO_LIST() {
        return NUMERO_LIST;
    }

    public void setNUMERO_LIST(int NUMERO_LIST) {
        this.NUMERO_LIST = NUMERO_LIST;
    }

    public String getNOMBRE_PART() {
        return NOMBRE_PART;
    }

    public void setNOMBRE_PART(String NOMBRE_PART) {
        this.NOMBRE_PART = NOMBRE_PART;
    }

    public String getESTADO_PARTICIPANTE() {
        return ESTADO_PARTICIPANTE;
    }

    public void setESTADO_PARTICIPANTE(String ESTADO_PARTICIPANTE) {
        this.ESTADO_PARTICIPANTE = ESTADO_PARTICIPANTE;
    }

    public String getESTADO_DEPOSITO() {
        return ESTADO_DEPOSITO;
    }

    public void setESTADO_DEPOSITO(String ESTADO_DEPOSITO) {
        this.ESTADO_DEPOSITO = ESTADO_DEPOSITO;
    }

    public String getESTADO_TRANSPORTE() {
        return ESTADO_TRANSPORTE;
    }

    public void setESTADO_TRANSPORTE(String ESTADO_TRANSPORTE) {
        this.ESTADO_TRANSPORTE = ESTADO_TRANSPORTE;
    }

    public int getEDAD_PART() {
        return EDAD_PART;
    }

    public void setEDAD_PART(int EDAD_PART) {
        this.EDAD_PART = EDAD_PART;
    }

    public int getN_RESERVA() {
        return N_RESERVA;
    }

    public void setN_RESERVA(int N_RESERVA) {
        this.N_RESERVA = N_RESERVA;
    }

}
