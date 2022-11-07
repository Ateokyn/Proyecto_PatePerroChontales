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
public class DAOReservas {
    //Metodo para ubicar datos en la BD.
    public Reservas Insertar(int id_clientr,int id_reservagira,String estado_reserva, java.sql.Date fecha_reserva) {

        String transaccion = "INSERT INTO RESERVAS VALUES('"
                + id_clientr + "', '"
                + id_reservagira + "', '"
                + estado_reserva + "', '"
                + fecha_reserva + "')";

        //Llama al metodo Actualizar ubicado en DataBase.java.
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Reservas(estado_reserva, fecha_reserva, id_clientr, id_reservagira);
        }
        return null;
    }

    //Metodo para actualizar un registro de las reservas en la BD.
    public int Actualizar(int id, int id_clienter, int id_resergira, String estado_reserva, java.sql.Date fecha_reserva) {

        String transaccion = "UPDATE RESERVAS SET ID_CLIENTE='"
                + id_clienter + "', ID_GIRA='"
                + id_resergira + "', ESTADO_RESERVA='"
                + estado_reserva + "', FECHA_RESERVA='"
                + fecha_reserva + "', WHERE N_RESERVA="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    //Metodo para seleccionar todos los registro de la tabla Reservas.
    public List ObtenerDatos() {
        String transaccion = "SELECT * FROM RESERVAS";
        //Llama al metodo Listar de DataBase.java.
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arreglo reservas.
        List<Reservas> reservas = new ArrayList();
        //Ciclo que recorre cada registro del y loas agrega al arreglo reservas.
        for (Map registro : registros) {
            Reservas rv = new Reservas((Integer) registro.get("N_RESERVA"),
                    (String) registro.get("ESTADO_RESERVA"),
                    (java.sql.Date) registro.get("FECHA_RESERVA"),
                    (Integer) registro.get("ID_CLIENTE"),
                    (Integer) registro.get("ID_GIRA"));

            
            reservas.add(rv);
        }
        //Retorno todos las giras ubicados en la tabla de BD.
        return reservas;
    }
    
    //Metodo para eliminar un registro de Reseva de la tabla de la BD.
    public int Eliminar(int id){
        String transaccion = "DELETE FROM N_RESERVA='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
