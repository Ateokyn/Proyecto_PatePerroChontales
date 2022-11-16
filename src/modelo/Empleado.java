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
public class Empleado {

    private int ID_EMPLEADO;
    private String NOMBRE_EMP1;
    private String NOMBRE_EMP2;
    private String APELLIDO_EMP1;
    private String APELLIDO_EMP2;
    private String DEPART_EMP;
    private String TELEFONO_EMP;
    private Date FECHANAC_EMP;

    public Empleado(int ID_EMPLEADO, String NOMBRE_EMP1, String NOMBRE_EMP2, String APELLIDO_EMP1, String APELLIDO_EMP2, String DEPART_EMP, String TELEFONO_EMP, Date FECHANAC_EMP) {
        this.ID_EMPLEADO = ID_EMPLEADO;
        this.NOMBRE_EMP1 = NOMBRE_EMP1;
        this.NOMBRE_EMP2 = NOMBRE_EMP2;
        this.APELLIDO_EMP1 = APELLIDO_EMP1;
        this.APELLIDO_EMP2 = APELLIDO_EMP2;
        this.DEPART_EMP = DEPART_EMP;
        this.TELEFONO_EMP = TELEFONO_EMP;
        this.FECHANAC_EMP = FECHANAC_EMP;
    }

    public Empleado(String NOMBRE_EMP1, String NOMBRE_EMP2, String APELLIDO_EMP1, String APELLIDO_EMP2, String DEPART_EMP, String TELEFONO_EMP, Date FECHANAC_EMP) {
        this.NOMBRE_EMP1 = NOMBRE_EMP1;
        this.NOMBRE_EMP2 = NOMBRE_EMP2;
        this.APELLIDO_EMP1 = APELLIDO_EMP1;
        this.APELLIDO_EMP2 = APELLIDO_EMP2;
        this.DEPART_EMP = DEPART_EMP;
        this.TELEFONO_EMP = TELEFONO_EMP;
        this.FECHANAC_EMP = FECHANAC_EMP;
    }

    public int getID_EMPLEADO() {
        return ID_EMPLEADO;
    }

    public void setID_EMPLEADO(int ID_EMPLEADO) {
        this.ID_EMPLEADO = ID_EMPLEADO;
    }

    public String getNOMBRE_EMP1() {
        return NOMBRE_EMP1;
    }

    public void setNOMBRE_EMP1(String NOMBRE_EMP1) {
        this.NOMBRE_EMP1 = NOMBRE_EMP1;
    }

    public String getNOMBRE_EMP2() {
        return NOMBRE_EMP2;
    }

    public void setNOMBRE_EMP2(String NOMBRE_EMP2) {
        this.NOMBRE_EMP2 = NOMBRE_EMP2;
    }

    public String getAPELLIDO_EMP1() {
        return APELLIDO_EMP1;
    }

    public void setAPELLIDO_EMP1(String APELLIDO_EMP1) {
        this.APELLIDO_EMP1 = APELLIDO_EMP1;
    }

    public String getAPELLIDO_EMP2() {
        return APELLIDO_EMP2;
    }

    public void setAPELLIDO_EMP2(String APELLIDO_EMP2) {
        this.APELLIDO_EMP2 = APELLIDO_EMP2;
    }

    public String getDEPART_EMP() {
        return DEPART_EMP;
    }

    public void setDEPART_EMP(String DEPART_EMP) {
        this.DEPART_EMP = DEPART_EMP;
    }

    public String getTELEFONO_EMP() {
        return TELEFONO_EMP;
    }

    public void setTELEFONO_EMP(String TELEFONO_EMP) {
        this.TELEFONO_EMP = TELEFONO_EMP;
    }

    public Date getFECHANAC_EMP() {
        return FECHANAC_EMP;
    }

    public void setFECHANAC_EMP(Date FECHANAC_EMP) {
        this.FECHANAC_EMP = FECHANAC_EMP;
    }

    
}