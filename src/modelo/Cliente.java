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
public class Cliente {

    private int ID_CLIENTE;
    private String NOMBRE_C1;
    private String NOMBRE_C2;
    private String APELLIDO_C1;
    private String APELLIDO_C2;
    private Date FECHANAC_C;
    private String DEPART_C;

    public Cliente(int ID_CLIENTE, String NOMBRE_C1, String NOMBRE_C2, String APELLIDO_C1, String APELLIDO_C2, Date FECHANAC_C, String DEPART_C) {
        this.ID_CLIENTE = ID_CLIENTE;
        this.NOMBRE_C1 = NOMBRE_C1;
        this.NOMBRE_C2 = NOMBRE_C2;
        this.APELLIDO_C1 = APELLIDO_C1;
        this.APELLIDO_C2 = APELLIDO_C2;
        this.FECHANAC_C = FECHANAC_C;
        this.DEPART_C = DEPART_C;
    }

    public Cliente(String NOMBRE_C1, String NOMBRE_C2, String APELLIDO_C1, String APELLIDO_C2, Date FECHANAC_C, String DEPART_C) {
        this.NOMBRE_C1 = NOMBRE_C1;
        this.NOMBRE_C2 = NOMBRE_C2;
        this.APELLIDO_C1 = APELLIDO_C1;
        this.APELLIDO_C2 = APELLIDO_C2;
        this.FECHANAC_C = FECHANAC_C;
        this.DEPART_C = DEPART_C;
    }

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

    public String getNOMBRE_C1() {
        return NOMBRE_C1;
    }

    public void setNOMBRE_C1(String NOMBRE_C1) {
        this.NOMBRE_C1 = NOMBRE_C1;
    }

    public String getNOMBRE_C2() {
        return NOMBRE_C2;
    }

    public void setNOMBRE_C2(String NOMBRE_C2) {
        this.NOMBRE_C2 = NOMBRE_C2;
    }

    public String getAPELLIDO_C1() {
        return APELLIDO_C1;
    }

    public void setAPELLIDO_C1(String APELLIDO_C1) {
        this.APELLIDO_C1 = APELLIDO_C1;
    }

    public String getAPELLIDO_C2() {
        return APELLIDO_C2;
    }

    public void setAPELLIDO_C2(String APELLIDO_C2) {
        this.APELLIDO_C2 = APELLIDO_C2;
    }

    public Date getFECHANAC_C() {
        return FECHANAC_C;
    }

    public void setFECHANAC_C(Date FECHANAC_C) {
        this.FECHANAC_C = FECHANAC_C;
    }

    public String getDEPART_C() {
        return DEPART_C;
    }

    public void setDEPART_C(String DEPART_C) {
        this.DEPART_C = DEPART_C;
    }

}
