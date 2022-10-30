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
public class DAOReservas {
    
    //Metodo para insertar datos en la BD.
    public Reservas Insertar(String estado_reserva){
        String transaccion = "INSERT INTO Reservas VALUES('"
                + estado_reserva + "')";
        
        //llama al metodo Actualizar ubicado en DataBase.java.
        if(new DataBase().Actualizar(transaccion)>0){
            return new Reservas(estado_reserva);
        }
        return null;
    }
    
    //Metodo para actualizar un registro en la BD.
    public int Actualizar(int id, String estado_reserva){
        String transaccion = "UPDATE Reservas SET estado_reserva='"
                + estado_reserva + "' WHERE numero_reserva="
                + id;
        
        return new DataBase().Actualizar(transaccion);
    }
    
    //Metodo para seleccionar todos los registros de la tabla.
    public List Obtenerdatos(){
        String transaccion = "SELECT * FROM Reservas";
        //Llama al metodo Listar de DataBase.java.
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arreglo de reservas.
        List<Reservas> reservas = new ArrayList();
        //Ciclo que recorre cada registro y los agrega al arreglo reservas.
        for(Map registro : registros){
            Reservas rsr = new Reservas((int) registro.get("numero_reserva"),
            (String) registro.get("estado_reserva"));
            reservas.add(rsr);
        }
        return reservas;//Retorna todas las reservas ubicadas en la tabla BD.
    }
    
    //Metodo para eliminar un registro de la tabla en la BD.
    public int Eliminar(int id){
        String transaccion = "DELETE FROM Reservas WHERE numero_reserva='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
