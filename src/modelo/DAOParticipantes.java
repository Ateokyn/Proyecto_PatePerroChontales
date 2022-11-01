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
    public Participantes Insertar(String estado_part, String estadp_deposito, String estado_transporte) {

        String transaccion = "INSERT INTO Participantes VALUES('"
                + estado_part + "', '"
                + estadp_deposito + "', '"
                + estado_transporte + "')";

        //Llama al metodo Actualizar ubicado en DataBase.java.
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Participantes(estado_part, estadp_deposito, estado_transporte);
        }
        return null;
    }

    //Metodo para actualizar un registro de las participantes en la BD.
    public int Actualizar(int id, String estado_part, String estado_deposito, String estado_transporte) {

        String transaccion = "UPDATE Participantes SET estado_part'"
                + estado_part + "' estado_deposito='"
                + estado_deposito + "' estado_transporte='"
                + estado_transporte + "' WHERE numero_list="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    //Metodo para seleccionar todos los registro de la tabla Participantes.
    public List ObtenerDatos(int id) {
        String transaccion = "SELECT * FROM Participantes";
        //Llama al metodo Listar de DataBase.java.
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arreglo participantes.
        List<Participantes> participantes = new ArrayList();
        //Ciclo que recorre cada registro del y loas agrega al arreglo participantes.
        for (Map registro : registros) {
            Participantes pt = new Participantes((int) registro.get("numero_list"),
                    (String) registro.get("estado_part"),
                    (String) registro.get("estado_deposito"),
                    (String) registro.get("estado_transporte"));
            
           participantes.add(pt);
        }
        //Retorno todos los participantes ubicados en la tabla de BD.
        return participantes;
    }
    
    //Metodo para eliminar un registro de participantes de la tabla de la BD.
    public int Eliminar(int id){
        String transaccion = "DELETE FROM numero_list='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
