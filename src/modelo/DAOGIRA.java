/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;
import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class DAOGIRA {

    public Gira Insertar(String NOMBRE_GIRA, double PRECIO_GIRA, double DISTANCIA_GIRA, Date FECHA_GIRA, int ID_EMPLEADO) {

        String transacciones = "Insert Into GIRAS Values('"
                + NOMBRE_GIRA + "','"
                + PRECIO_GIRA + "','"
                + DISTANCIA_GIRA + "','"
                + FECHA_GIRA + "','"
                + ID_EMPLEADO + "')";

        if (new DataBase().Actualizar(transacciones) > 0) {
            return new Gira(NOMBRE_GIRA, PRECIO_GIRA, DISTANCIA_GIRA, FECHA_GIRA, ID_EMPLEADO);
        }
        return null;
    }

    public int Actualizar(int id, String NOMBRE_GIRA, double PRECIO_GIRA, double DISTANCIA_GIRA, Date FECHA_GIRA, int ID_EMPLEADO) {

        String transaccion = "Update GIRAS Set NOMBRE_GIRA='"
                + NOMBRE_GIRA + "',PRECIO_GIRA='"
                + PRECIO_GIRA + "',DISTANCIA_GIRA='"
                + DISTANCIA_GIRA + "',FECHA_GIRA='"
                + FECHA_GIRA + "',ID_EMPLEADO='"
                + ID_EMPLEADO + "' Where ID_GIRA="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    public List ObtenerDatos() {

        String transaccion = "Select * From GIRAS";

        List<Map> registros = new DataBase().Listar(transaccion);
        List<Gira> gira = new ArrayList();

        for (Map registro : registros) {
            Gira gr = new Gira((int) registro.get("ID_GIRA"),
                    (String) registro.get("NOMBRE_GIRA"),
                    (double) registro.get("PRECIO_GIRA"),
                    (double) registro.get("DISTANCIA_GIRA"),
                    (Date) registro.get("FECHA_GIRA"),
                    (int) registro.get("ID_EMPLEADO"));
            gira.add(gr);
        }
        return gira;
    }
    public int Eliminar(int id){
        String transaccion = "Delete From GIRAS Where ID_GIRA='" + id +"'";
        return new DataBase().Actualizar(transaccion);
    }
    
}
