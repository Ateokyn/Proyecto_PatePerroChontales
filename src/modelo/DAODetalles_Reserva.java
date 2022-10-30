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
public class DAODetalles_Reserva {

    //Metodo para insertar datos en la BD.
    public Detalles_Reserva Insertar(java.sql.Date fecha_reserva) {
        String transaccion = "INSERT INTO Detalles_Reserva VALUES('"
                + fecha_reserva + "')";

        //Llama al metodo Actualizar ubicado en DataBase.java.
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Detalles_Reserva(fecha_reserva);
        }
        return null;
    }

    //Metodo para actualizar un registro en la BD.
    public int Actualizar(int id, java.sql.Date fecha_reserva) {
        String transaccion = "UPDATE Deatlles_Reserva SET fecha_reserva='"
                + fecha_reserva + "' WHERE numero_reservaP="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    //Metodo para seleccionr todos los registros de la tabla.
    public List ObtenerDatos() {
        String transaccion = "SELECT * FROM Detalles_Reserva";
        //Llama al metodo Listar de DataBase.java.
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arrelo detalles_reserva.
        List<Detalles_Reserva> detalles_reserva = new ArrayList();
        //Ciclo qye recorre cada registro y lpos agrega al arreglo detalles_reserva.
        for (Map registro : registros) {
            Detalles_Reserva dr = new Detalles_Reserva((int) registro.get("numero_reservaP"),
                    (int) registro.get("id_pR"),
                    (java.sql.Date) registro.get("fecha_reserva"));
            detalles_reserva.add(dr);
        }
        //Retorna todos lo detalles_reserva ubicados en la tabla BD.
        return detalles_reserva;
    }

    //Metodo para eliminar un registro de la tabla BD.
    public int ELiminar(int id) {
        String transaccion = "DELETE FROM detalles_reserva WHERE numer_reservaP='" + id + "'";
        return new DataBase().Actualizar(transaccion);
    }
}
