/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class Participante {

    private int NUMERO_LIST;
    private String NOMBRE_PART1;
    private String NOMBRE_PART2;
    private String ESTADO_P;
    private String ESTADO_DEPO;
    private String ESTADO_TRANSP;
    private Date FECHANAC_PART;
    private int N_RESERVA;

    public Participante(int NUMERO_LIST, String NOMBRE_PART1, String NOMBRE_PART2, String ESTADO_P, String ESTADO_DEPO, String ESTADO_TRANSP, Date FECHANAC_PART, int N_RESERVA) {
        this.NUMERO_LIST = NUMERO_LIST;
        this.NOMBRE_PART1 = NOMBRE_PART1;
        this.NOMBRE_PART2 = NOMBRE_PART2;
        this.ESTADO_P = ESTADO_P;
        this.ESTADO_DEPO = ESTADO_DEPO;
        this.ESTADO_TRANSP = ESTADO_TRANSP;
        this.FECHANAC_PART = FECHANAC_PART;
        this.N_RESERVA = N_RESERVA;
    }

    public Participante(String NOMBRE_PART1, String NOMBRE_PART2, String ESTADO_P, String ESTADO_DEPO, String ESTADO_TRANSP, Date FECHANAC_PART, int N_RESERVA) {
        this.NOMBRE_PART1 = NOMBRE_PART1;
        this.NOMBRE_PART2 = NOMBRE_PART2;
        this.ESTADO_P = ESTADO_P;
        this.ESTADO_DEPO = ESTADO_DEPO;
        this.ESTADO_TRANSP = ESTADO_TRANSP;
        this.FECHANAC_PART = FECHANAC_PART;
        this.N_RESERVA = N_RESERVA;
    }

    public int getNUMERO_LIST() {
        return NUMERO_LIST;
    }

    public void setNUMERO_LIST(int NUMERO_LIST) {
        this.NUMERO_LIST = NUMERO_LIST;
    }

    public String getNOMBRE_PART1() {
        return NOMBRE_PART1;
    }

    public void setNOMBRE_PART1(String NOMBRE_PART1) {
        this.NOMBRE_PART1 = NOMBRE_PART1;
    }

    public String getNOMBRE_PART2() {
        return NOMBRE_PART2;
    }

    public void setNOMBRE_PART2(String NOMBRE_PART2) {
        this.NOMBRE_PART2 = NOMBRE_PART2;
    }

    public String getESTADO_P() {
        return ESTADO_P;
    }

    public void setESTADO_P(String ESTADO_P) {
        this.ESTADO_P = ESTADO_P;
    }

    public String getESTADO_DEPO() {
        return ESTADO_DEPO;
    }

    public void setESTADO_DEPO(String ESTADO_DEPO) {
        this.ESTADO_DEPO = ESTADO_DEPO;
    }

    public String getESTADO_TRANSP() {
        return ESTADO_TRANSP;
    }

    public void setESTADO_TRANSP(String ESTADO_TRANSP) {
        this.ESTADO_TRANSP = ESTADO_TRANSP;
    }

    public Date getFECHANAC_PART() {
        return FECHANAC_PART;
    }

    public void setFECHANAC_PART(Date FECHANAC_PART) {
        this.FECHANAC_PART = FECHANAC_PART;
    }

    public int getN_RESERVA() {
        return N_RESERVA;
    }

    public void setN_RESERVA(int N_RESERVA) {
        this.N_RESERVA = N_RESERVA;
    }

    
}