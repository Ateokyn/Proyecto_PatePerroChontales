/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Kentry Gutter
 */
public class Cliente {
    
    private int ID_CLIENTE;
    private String NOMBRE_C;
    private String APELLIDO_C1;
    private String APELLIDO_C2;
    private int EDAD_C;
    private String DEPART_C;

    public Cliente(int ID_CLIENTE, String NOMBRE_C, String APELLIDO_C1, String APELLIDO_C2, int EDAD_C, String DEPART_C) {
        this.ID_CLIENTE = ID_CLIENTE;
        this.NOMBRE_C = NOMBRE_C;
        this.APELLIDO_C1 = APELLIDO_C1;
        this.APELLIDO_C2 = APELLIDO_C2;
        this.EDAD_C = EDAD_C;
        this.DEPART_C = DEPART_C;
    }

    public Cliente(String NOMBRE_C, String APELLIDO_C1, String APELLIDO_C2, int EDAD_C, String DEPART_C) {
        this.NOMBRE_C = NOMBRE_C;
        this.APELLIDO_C1 = APELLIDO_C1;
        this.APELLIDO_C2 = APELLIDO_C2;
        this.EDAD_C = EDAD_C;
        this.DEPART_C = DEPART_C;
    }

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

    public String getNOMBRE_C() {
        return NOMBRE_C;
    }

    public void setNOMBRE_C(String NOMBRE_C) {
        this.NOMBRE_C = NOMBRE_C;
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

    public int getEDAD_C() {
        return EDAD_C;
    }

    public void setEDAD_C(int EDAD_C) {
        this.EDAD_C = EDAD_C;
    }

    public String getDEPART_C() {
        return DEPART_C;
    }

    public void setDEPART_C(String DEPART_C) {
        this.DEPART_C = DEPART_C;
    }
   
}
