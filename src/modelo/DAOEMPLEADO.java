/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;

/**
 *
 * @author Kentry Gutter
 */
public class DAOEMPLEADO {

    public Empleado Insertar(String NOMBRE_EMP, String APELLIDO_EMP1, String APELLIDO_EMP2, String DEPART_EMP, String TELEFONO_EMP, int EDAD_EMP) {

        String transacciones = "Insert Into EMPLEADOS Values('"
                + NOMBRE_EMP + "','"
                + APELLIDO_EMP1 + "','"
                + APELLIDO_EMP2 + "','"
                + DEPART_EMP + "','"
                + TELEFONO_EMP + "',"
                + EDAD_EMP + ")";

        if (new DataBase().Actualizar(transacciones) > 0) {
            return new Empleado(NOMBRE_EMP, APELLIDO_EMP1, APELLIDO_EMP2, DEPART_EMP, TELEFONO_EMP, EDAD_EMP);
        }
        return null;
    }

    public int Actualizar(int id, String NOMBRE_EMP, String APELLIDO_EMP1, String APELLIDO_EMP2, String DEPART_EMP, String TELEFONO_EMP, int EDAD_EMP) {

        String transaccion = "Update EMPLEADOS set NOMBRE_EMP='"
                + NOMBRE_EMP + "',APELLIDO_EMP1='"
                + APELLIDO_EMP1 + "',APELLIDO_EMP2='"
                + APELLIDO_EMP2 + "',DEPART_EMP='"
                + DEPART_EMP + "',TELEFONO_EMP='"
                + TELEFONO_EMP + "', EDAD_EMP="
                + EDAD_EMP + " Where ID_EMPLEADO="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    public List ObtenerDatos() {
        String transaccion = "Select * From EMPLEADOS";

        List<Map> registros = new DataBase().Listar(transaccion);
        List<Empleado> empleado = new ArrayList();

        for (Map registro : registros) {
            Empleado emp = new Empleado((int) registro.get("ID_EMPLEADO"),
                    (String) registro.get("NOMBRE_EMP"),
                    (String) registro.get("APELLIDO_EMP1"),
                    (String) registro.get("APELLIDO_EMP2"),
                    (String) registro.get("DEPART_EMP"),
                    (String) registro.get("TELEFONO_EMP"),
                    (int) registro.get("EDAD_EMP"));
            empleado.add(emp);
        }
        return empleado;
    }
    public int Eliminar(int id){
        String transaccion = "Delete From EMPLEADOS Where ID_EMPLEADO='" + id +"'";
        return new DataBase().Actualizar(transaccion);
    }
}
