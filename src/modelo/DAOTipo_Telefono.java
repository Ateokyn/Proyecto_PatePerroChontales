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
public class DAOTipo_Telefono {

    //Metodo para insertar datos en la BD.
    public Tipo_Telefono Insertar(String tipotel) {
        String transaccion = "INSERT INTO Tipo_Telefono VALUES('"
                + tipotel + "')";

        //Llama al metodo Actualizar ubicado en DataBase.java.
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Tipo_Telefono(tipotel);
        }
        return null;
    }

    //Metodo para Actualizar un registro en la BD.
    public int Actualiar(int id, String tipotel) {
        String transaccion = "UPDATE Tipo_Telefono SET tipotel='"
                + tipotel + "' WHERE id_tipotel"
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    //Metodo para seleccionar todos los registros de la tabla.
    public List ObtenerDatos() {
        String transaccion = "SELECT * FROM Tipo_Telefono";
        //Llama al metodo Listar de DataBase.java.
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arreglo tipo_telefono.
        List<Tipo_Telefono> tipo_telefono = new ArrayList();
        //Ciclo que recorre cada registro y los agrega al arreglo tipo_telefono.
        for (Map registro : registros) {
            Tipo_Telefono tp = new Tipo_Telefono((int) registro.get("id_tipotel"),
            (String) registro.get("tipotel"));
            tipo_telefono.add(tp);
        }
        return tipo_telefono;
    }
    
    //Metodo para eliminar un registro en la tabla en la BD.
    public int Eliminar(int id){
        String transaccion = "DELETE FROM Tipo_Telefono WHERE id_tipotel='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
