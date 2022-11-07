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
public class DAOParticipantes {
    //Metodo para ubicar datos en la BD.
    public Participantes Insertar(String nombre_part,String estado_part, String estado_deposito, String estado_transporte, int edad_part) {

        String transaccion = "INSERT INTO PARTICIPANTES VALUES('"
                + nombre_part + "', '"
                + estado_part + "', '"
                + estado_deposito + "', '"
                + estado_transporte + "', '"
                + edad_part + "')";

        //Llama al metodo Actualizar ubicado en DataBase.java.
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Participantes(nombre_part, estado_part, estado_deposito, estado_transporte, edad_part);
        }
        return null;
    }

    //Metodo para actualizar un registro de las participantes en la BD.
    public int Actualizar(int id, String nombre_part, String estado_part, String estado_deposito, String estado_transporte, int edad_part) {

        String transaccion = "UPDATE PARTICIPANTES SET NOMBRE_PART='"
                + nombre_part + "' ESTADO_PARTICIPANTE='"
                + estado_part + "' ESTADO_DEPOSITO='"
                + estado_deposito + "' ESTADO_TRANSPORTE='"
                + estado_transporte + "' EDAD_PART='"
                + edad_part + "' WHERE NUMERO_LIST="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    //Metodo para seleccionar todos los registro de la tabla Participantes.
    public List ObtenerDatos() {
        String transaccion = "SELECT * FROM PARTICIPANTES";
        //Llama al metodo Listar de DataBase.java.
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arreglo participantes.
        List<Participantes> participantes = new ArrayList();
        //Ciclo que recorre cada registro del y loas agrega al arreglo participantes.
        for (Map registro : registros) {
            Participantes pt = new Participantes((Integer) registro.get("NUMERO_LIST"),
                    (String) registro.get("NOMBRE_PART"),
                    (String) registro.get("ESTADO_PARTICIPANTE"),
                    (String) registro.get("ESTADO_DEPOSITO"),
                    (String) registro.get("ESTADO_TRANSPORTE"),
                    (Integer) registro.get("EDAD_PART"));
            
           participantes.add(pt);
        }
        //Retorno todos los participantes ubicados en la tabla de BD.
        return participantes;
    }
    
    //Metodo para eliminar un registro de participantes de la tabla de la BD.
    public int Eliminar(int id){
        String transaccion = "DELETE FROM N_RESERVA='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
