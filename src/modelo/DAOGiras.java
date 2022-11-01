/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;
import java.sql.Date;
/**
 *
 * @author Kentry Gutter
 */
public class DAOGiras {
     //Metodo para ubicar datos en la BD.
    public Giras Insertar(String nombre_gira, float precio_gira,
            float distancia_gira, java.sql.Date fecha_gira) {

        String transaccion = "INSERT INTO Giras VALUES('"
                + nombre_gira + "', '"
                + precio_gira + "', '"
                + distancia_gira + "', '"
                + fecha_gira+ "')";

        //Llama al metodo Actualizar ubicado en DataBase.java.
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Giras(nombre_gira, precio_gira, distancia_gira, fecha_gira);
        }
        return null;
    }

    //Metodo para actualizar un registro de las giras en la BD.
    public int Actualizar(int id, String nombre_gira, float precio_gira, float distancia_gira, Date fecha_gir) {

        String transaccion = "UPDATE Empleados SET nombre_gira'"
                + nombre_gira + "' precio_gira='"
                + precio_gira + "' distancia_gira='"
                + distancia_gira + "' WHERE id_gira="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    //Metodo para seleccionar todos los registro de la tabla Giras.
    public List ObtenerDatos(int id) {
        String transaccion = "SELECT * FROM Giras";
        //Llama al metodo Listar de DataBase.java.
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arreglo giras.
        List<Giras> giras = new ArrayList();
        //Ciclo que recorre cada registro del y loas agrega al arreglo giras.
        for (Map registro : registros) {
            Giras gr = new Giras((int) registro.get("id_gira"),
                    (String) registro.get("nombre_gira"),
                    (float) registro.get("precio_gira"),
                    (float) registro.get("distancia_gira"),
                    (java.sql.Date) registro.get("fecha_gira"));
            
            giras.add(gr);
        }
        //Retorno todos las giras ubicados en la tabla de BD.
        return giras;
    }
    
    //Metodo para eliminar un registro del empleado de la tabla de la BD.
    public int Eliminar(int id){
        String transaccion = "DELETE FROM id_gira='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}