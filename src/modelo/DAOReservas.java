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
public class DAOReservas {
    //Metodo para ubicar datos en la BD.
    public Reservas Insertar(String estado_reserva, java.sql.Date fecha_reserva) {

        String transaccion = "INSERT INTO Reservas VALUES('"
                + estado_reserva + "', '"
                + fecha_reserva + "')";

        //Llama al metodo Actualizar ubicado en DataBase.java.
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Reservas(estado_reserva, fecha_reserva);
        }
        return null;
    }

    //Metodo para actualizar un registro de las reservas en la BD.
    public int Actualizar(int id, String estado_reserva, java.sql.Date fecha_reserva) {

        String transaccion = "UPDATE Reservas SET estado_reserva'"
                + estado_reserva + "' fecha_reserva='"
                + fecha_reserva + "' WHERE n_reserva="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    //Metodo para seleccionar todos los registro de la tabla Reservas.
    public List ObtenerDatos(int id) {
        String transaccion = "SELECT * FROM Reservas";
        //Llama al metodo Listar de DataBase.java.
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arreglo reservas.
        List<Reservas> reservas = new ArrayList();
        //Ciclo que recorre cada registro del y loas agrega al arreglo reservas.
        for (Map registro : registros) {
            Reservas rv = new Reservas((int) registro.get("n_reserva"),
                    (String) registro.get("estado_reserva"),
                    (java.sql.Date) registro.get("fecha_reserva"));
            
            reservas.add(rv);
        }
        //Retorno todos las giras ubicados en la tabla de BD.
        return reservas;
    }
    
    //Metodo para eliminar un registro de Reseva de la tabla de la BD.
    public int Eliminar(int id){
        String transaccion = "DELETE FROM n_reserva='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
