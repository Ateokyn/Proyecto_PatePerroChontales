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
public class DAOLista_Participantes {
    //Metodo para insertar datos en la BD.
    public Lista_Participantes Insertar(String estado_p, String estado_deposito,String estado_transporte) {
        String transaccion = "INSERT INTO Lista_Participantes VALUES('"
                + estado_p + "' "
                + estado_deposito +"' "
                + estado_transporte + "')";
        //Llama al metodo Actualizar ubicado en DataBase.java.
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Lista_Participantes(estado_p,estado_deposito,estado_transporte);
        }
        return null;
    }

    //Metodo para actualizar un registro en la BD.
    public int Actualizar(int id, String estado_p,String estado_deposito, String estado_transporte) {
        String transaccion = "UPDATE Lista_Participantes SET estado_p='"
                + estado_p + "' estado_deposito='"
                + estado_deposito + "' estado_transporte='"
                + estado_transporte + "' WHERE numero_list="
                + id;
        return new DataBase().Actualizar(transaccion);
    }

    //Metodo para seleccionar todos los registros de la tabla.
    public List ObtenerDatos() {
        String transaccion = "SELECT * FROM Lista_Participantes";
        //Llama al metodo Listar de DataBase.java.
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arreglo lista_participantes.
        List<Lista_Participantes> lista_participantes = new ArrayList();
        //Ciclo que recorre cada registro y los agrega al arreglo lista_participantes.
        for (Map registro : registros) {
            Lista_Participantes lp = new Lista_Participantes((int) registro.get("numero_list"),
                    (String) registro.get("estado_p"),
                    (String) registro.get("estado_deposito"),
                    (String) registro.get("estado_transporte"));
            lista_participantes.add(lp);
        }
        //retorna todos los emppleados ubicados en la tabla de BD.
        return lista_participantes;
    }
    
    //Metodo para eliminar un registro de la tabla en la BD.
    public int Eliminar(int id){
        String transaccion = "DELETE FROM Lista_Participantes WHERE numero_list='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
