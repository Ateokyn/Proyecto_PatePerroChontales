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
public class DAOParticipante {

    //Metodo para insertar datos en la BD.
    public Participante Insertar(String nombre_p, String apellido_p1, String apellido_p2, int edad_p, String departamento_p) {
        String transaccion = "INSERT INTO Participante VALUES('"
                + nombre_p + "' "
                + apellido_p1 + "' "
                + apellido_p2 + "' "
                + edad_p + "' "
                + departamento_p + "')";

        //LLama al metodo Actualizar ubicado en DataBase.java.
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Participante(nombre_p, apellido_p1, apellido_p2, edad_p, departamento_p);
        }
        return null;
    }

    //Metodo para actualizar un registro en la BD.
    public int Actualizar(int id, String nombre_p, String apellido_p1, String apellido_p2, int edad_p, String departamento_p) {
        String transaccion = "UPDATE Participante SET nombre_p='"
                + nombre_p + "', apellido_p1='"
                + apellido_p1 + "', apellido_p2='"
                + apellido_p2 + "',edad_p='"
                + edad_p + "', departamento_p='"
                + departamento_p + "' WHERE id_p="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    //Metodo para seleccionar todos los registros de la tabla.
    public List ObtenerDatos() {
        String transaccion = "SELET * FROM Participante";
        //Llama al metodo Listar de DataBase.java.
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Participante> participante = new ArrayList();//Arreglo participante.
        //Ciclo que recorre cada registro y los agrega al arreglo participante.
        for (Map registro : registros) {
            Participante part = new Participante((int) registro.get("id_p"),
                    (String) registro.get("nombre_p"),
                    (String) registro.get("apellido_p1"),
                    (String) registro .get("apellido_p2"),
                    (int) registro.get("edad_p"),
                    (String) registro.get("departamento_p"));
            participante.add(part);
        }
        return participante;
    }
    
    //Metodo para liminar un registro de la tabla en la BD.
    public int Eliminar(int id){
        String transaccion = "DELETE FROM Participante WHERE id_p='"+ id +"'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
