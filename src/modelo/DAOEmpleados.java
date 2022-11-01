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

        String transaccion = "INSERT INTO Empleados VALUES('"
                + nombre_emp + "', '"
                + apellido_emp1 + "', '"
                + apellido_emp2 + "', '"
                + depart_emp + "', '"
                + edad_emp + "')";

        //Llama al metodo Actualizar ubicado en DataBase.java.
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Empleados(nombre_emp, apellido_emp1, apellido_emp2, depart_emp, telefono_emp, edad_emp);
        }
        return null;
    }

    //Metodo para actualizar un registro del empleado en la BD.
    public int Actualizar(int id, String nombre_emp, String apellido_emp1, String apellido_emp2,
            String depart_emp, int edad_emp) {

        String transaccion = "UPDATE Empleados SET nombre_emp'"
                + nombre_emp + "' apellido_emp1='"
                + apellido_emp1 + "' apellido_emp2='"
                + depart_emp + "' edad_emp='"
                + edad_emp + "' WHERE id_empleado="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    //Metodo para seleccionar todos los registro de la tabla Empleados.
    public List ObtenerDatos(int id) {
        String transaccion = "SELECT * FROM Empleados";
        //Llama al metodo Listar de DataBase.java.
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arreglo empleados.
        List<Empleados> empleados = new ArrayList();
        //Ciclo que recorre cada registro del y loas agrega al arreglo empleados.
        for (Map registro : registros) {
            Empleados emp = new Empleados((int) registro.get("id_empleado"),
                    (String) registro.get("nombre_emp"),
                    (String) registro.get("apellido_emp1"),
                    (String) registro.get("apellido_emp2"),
                    (String) registro.get("depart_emp"),
                    (String) registro.get("telefono_emp"),
                    (int) registro.get("edad_emp"));
            
            empleados.add(emp);
        }
        //Retorno todos los empleados ubicados en la tabla de BD.
        return empleados;
    }
    
    //Metodo para eliminar un registro del empleado de la tabla de la BD.
    public int Eliminar(int id){
        String transaccion = "DELETE FROM id_empleado='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
