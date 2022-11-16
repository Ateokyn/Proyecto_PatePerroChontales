/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;

/**
 *
 * @author Kentry Gutter
 */
public class DAOEMPLEADO {

    public Empleado Insertar(String NOMBRE_EMP1,String NOMBRE_EMP2, String APELLIDO_EMP1, String APELLIDO_EMP2, String DEPART_EMP, String TELEFONO_EMP, java.sql.Date FECHANAC_EMP) {

        String transacciones = "Insert Into EMPLEADOS Values('"
                + NOMBRE_EMP1 + "','"
                + NOMBRE_EMP2 + "','"
                + APELLIDO_EMP1 + "','"
                + APELLIDO_EMP2 + "','"
                + DEPART_EMP + "','"
                + TELEFONO_EMP + "','"
                + FECHANAC_EMP + "')";

        if (new DataBase().Actualizar(transacciones) > 0) {
            return new Empleado(NOMBRE_EMP1,NOMBRE_EMP2, APELLIDO_EMP1, APELLIDO_EMP2, DEPART_EMP, TELEFONO_EMP, FECHANAC_EMP);
        }
        return null;
    }

    public int Actualizar(int id, String NOMBRE_EMP1,String NOMBRE_EMP2, String APELLIDO_EMP1, String APELLIDO_EMP2, String DEPART_EMP, String TELEFONO_EMP, java.sql.Date FECHANAC_EMP) {

        String transaccion = "Update EMPLEADOS set NOMBRE_EMP1='"
                + NOMBRE_EMP1 + "',NOMBRE_EMP2='"
                + NOMBRE_EMP2 + "',APELLIDO_EMP1='"
                + APELLIDO_EMP1 + "',APELLIDO_EMP2='"
                + APELLIDO_EMP2 + "',DEPART_EMP='"
                + DEPART_EMP + "',TELEFONO_EMP='"
                + TELEFONO_EMP + "', FECHANAC_EMP='"
                + FECHANAC_EMP + "' Where ID_EMPLEADO="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    public List ObtenerDatos() {
        String transaccion = "Select * From EMPLEADOS";

        List<Map> registros = new DataBase().Listar(transaccion);
        List<Empleado> empleado = new ArrayList();

        for (Map registro : registros) {
            Empleado emp = new Empleado((int) registro.get("ID_EMPLEADO"),
                    (String) registro.get("NOMBRE_EMP1"),
                    (String) registro.get("NOMBRE_EMP2"),
                    (String) registro.get("APELLIDO_EMP1"),
                    (String) registro.get("APELLIDO_EMP2"),
                    (String) registro.get("DEPART_EMP"),
                    (String) registro.get("TELEFONO_EMP"),
                    (java.sql.Date) registro.get("FECHANAC_EMP"));
            empleado.add(emp);
        }
        return empleado;
    }
    public int Eliminar(int id){
        String transaccion = "Delete From EMPLEADOS Where ID_EMPLEADO='" + id +"'";
        return new DataBase().Actualizar(transaccion);
    }
}
