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
public class DAODetalles_Gira {
    
    //Metodo para insertar datos en la BD.
    public Detalles_Gira Insertar(java.sql.Date fecha_inscripcion){
        
        String transaccion = "INSERT INTO Detalles_Giras VALUES('"
                + fecha_inscripcion + "')";
        
        //Llama al metodo actualizar ubicado en DataBase.java.
        if(new DataBase(). Actualizar(transaccion) > 0){
            return new Detalles_Gira(fecha_inscripcion);
        }
        return null;
    }
    
    //Metodo para actualizar un registro en la BD.
    public int Actualizar(int id, java.sql.Date fecha_inscripcion){
        String transaccion = "UPDATE Detalles_Gira SET fecha_inscripcion'"
                + fecha_inscripcion + "' WHERE id_giraP="
                + id;
        
        return new DataBase(). Actualizar(transaccion);
    }
    
    public List ObtenerDatos(){
        String transaccion = "SELECT * FROM Detalles_Gira";
        
        //Llama al metodo Listar de DataBase.java. 
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arreglo de detalle_g.
        List<Detalles_Gira> detalles_g = new ArrayList();
        //Ciclo que recorre cada registro y los agrega al arreglo detalles_g.
        for(Map registro : registros){
            Detalles_Gira dg = new Detalles_Gira((int) registro.get("id_giraP"),
            (int) registro.get("id_pG"),
            (java.sql.Date) registro.get("fecha_inscripcion"));
            detalles_g.add(dg);
        }
        return detalles_g;
     }
    
    //Metodo para eliminar un registro de la tabla BD.
    public int Eliminar(int id){
        String transaccion = "DELTE FROM Detalles_Gira WHERE id_giraP='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
