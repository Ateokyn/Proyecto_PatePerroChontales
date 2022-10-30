/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import java.util.*;

/**
 *
 * @author Kentry Gutter
 */
public class DAOEmpleado {

    //Metodo para insertar datos en la BD.
    public Empleados Insertar(String nombre_emp, String apellido_emp1, String apellido_emp2,
            String depart_emp, String telefono_emp, int edad_emp) {
        String transaccion = "INSERT INTO Empleados VALUES('"
                + nombre_emp + "' "
                + apellido_emp1 + "' "
                + apellido_emp2 + "' "
                + depart_emp + "' "
                + telefono_emp + "' "
                + edad_emp + "')";
        //Llama al metodo Actualizar ubicado en DataBase.java.
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Empleados(nombre_emp, apellido_emp1, apellido_emp2, depart_emp, telefono_emp, edad_emp);
        }
        return null;
    }

    //Metodo para actualizar un registro en la BD.
    public int Actualizar(int id, String nombre_emp, String apelldio_emp1, String apellido_emp2, String telefono_emp, String depart_emp, int edad_emp) {
        String transaccion = "UPDATE Empleados SET nombre_emp='"
                + nombre_emp + "' apellido_emp1='"
                + apelldio_emp1 + "' apellido_emp2='"
                + apellido_emp2 + "' telefono_emp='"
                + telefono_emp + "' depart_emp"
                + depart_emp + "' edad_emp='"
                + edad_emp + "' WHERE id_empleado="
                + id;
        return new DataBase().Actualizar(transaccion);
    }

    //Metodo para seleccionar todos los registros de la tabla.
    public List ObtenerDatos() {
        String transaccion = "SELECT * FROM Empleados";
        //Llama al metodo Listar de DataBase.java.
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arreglo empleados.
        List<Empleados> empleados = new ArrayList();
        //Ciclo que recorre cada registro y los agrega al arreglo empleados.
        for (Map registro : registros) {
            Empleados emp = new Empleados((int) registro.get("id_emplado"),
                    (String) registro.get("nombre_emp"),
                    (String) registro.get("apellio_em1"),
                    (String) registro.get("apellido_emp2"),
                    (String) registro.get("telefono_emp"),
                    (String) registro.get("depart_emp"),
                    (int) registro.get("edad_emp"));
            empleados.add(emp);
        }
        //retorna todos los empleados ubicados en la tabla de BD.
        return empleados;
    }
    
    //Metodo para eliminar un registro de la tabla en la BD.
    public int Eliminar(int id){
        String transaccion = "DELETE FROM Empleados WHERE id_empleado='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
