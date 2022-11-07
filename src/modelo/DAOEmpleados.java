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
public class DAOEmpleados {

    //Metodo para ubicar datos en la BD.
    public Empleados Insertar(String nombre_emp, String apellido_emp1,
            String apellido_emp2, String depart_emp, String telefono_emp, int edad_emp) {

        String transaccion = "INSERT INTO EMPLEADOS VALUES('"
                + nombre_emp + "', '"
                + apellido_emp1 + "', '"
                + apellido_emp2 + "', '"
                + depart_emp + "', '"
                + telefono_emp + "', '"
                + edad_emp + "')";

        //Llama al metodo Actualizar ubicado en DataBase.java.
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Empleados(nombre_emp, apellido_emp1, apellido_emp2, depart_emp, telefono_emp, edad_emp);
        }
        return null;
    }

    //Metodo para actualizar un registro del empleado en la BD.
    public int Actualizar(int id, String nombre_emp, String apellido_emp1, String apellido_emp2,
            String depart_emp,String telefono_emp, int edad_emp) {

        String transaccion = "UPDATE EMPLEADOS SET NOMBRE_EMP='"
                + nombre_emp + "', APELLIDO_EMP1='"
                + apellido_emp1 + "', APELLIDO_EMP2='"
                + apellido_emp2 + "', DEPART_EMP='"
                + depart_emp + "', TELEFONO_EMP='"
                + telefono_emp + "', EDAD_EMP='"
                + edad_emp + "' WHERE ID_EMPLEADO="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    //Metodo para seleccionar todos los registro de la tabla Empleados.
    public List ObtenerDatos() {
        String transaccion = "SELECT * FROM EMPLEADOS";
        //Llama al metodo Listar de DataBase.java.
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arreglo empleados.
        List<Empleados> empleados = new ArrayList();
        //Ciclo que recorre cada registro del y loas agrega al arreglo empleados.
        for (Map registro : registros) {
            Empleados emp = new Empleados((Integer) registro.get("ID_EMPLEADO"),
                    (String) registro.get("NOMBRE_EMP"),
                    (String) registro.get("APELLIDO_EMP1"),
                    (String) registro.get("APELLIDO_EMP2"),
                    (String) registro.get("DEPART_EMP"),
                    (String) registro.get("TELEFONO_EMP"),
                    (Integer) registro.get("EDAD_EMP"));
            
            empleados.add(emp);
        }
        //Retorno todos los empleados ubicados en la tabla de BD.
        return empleados;
    }
    
    //Metodo para eliminar un registro del empleado de la tabla de la BD.
    public int Eliminar(int id){
        String transaccion = "DELETE FROM ID_EMPLEADO='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
