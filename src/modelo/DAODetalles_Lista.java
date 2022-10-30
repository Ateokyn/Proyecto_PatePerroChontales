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
public class DAODetalles_Lista {
     //Metodo para insertar datos en la BD.
    public Detalles_Lista Insertar(java.sql.Date fecha_registro){
        
        String transaccion = "INSERT INTO Detalles_Lista VALUES('"
                + fecha_registro + "')";
        
        //Llama al metodo actualizar ubicado en DataBase.java.
        if(new DataBase(). Actualizar(transaccion) > 0){
            return new Detalles_Lista(fecha_registro);
        }
        return null;
    }
    
    //Metodo para actualizar un registro en la BD.
    public int Actualizar(int id, java.sql.Date fecha_registro){
        String transaccion = "UPDATE Detalles_Lista SET fecha_registro'"
                + fecha_registro + "' WHERE numero_listP="
                + id;
        
        return new DataBase(). Actualizar(transaccion);
    }
    
    public List ObtenerDatos(){
        String transaccion = "SELECT * FROM Detalles_Lista";
        
        //Llama al metodo Listar de DataBase.java. 
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arreglo de detalles_lista.
        List<Detalles_Lista> detalles_lista = new ArrayList();
        //Ciclo que recorre cada registro y los agrega al arreglo detalles_lista.
        for(Map registro : registros){
            Detalles_Lista dl = new Detalles_Lista((int) registro.get("numero_listP"),
            (int) registro.get("id_pL"),
            (java.sql.Date) registro.get("fecha_registro"));
            detalles_lista.add(dl);
        }
        return detalles_lista;
     }
    
    //Metodo para eliminar un registro de la tabla BD.
    public int Eliminar(int id){
        String transaccion = "DELTE FROM Detalles_Lista WHERE numero_listP='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
