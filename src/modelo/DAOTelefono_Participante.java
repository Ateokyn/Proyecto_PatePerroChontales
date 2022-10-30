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
public class DAOTelefono_Participante {
    //Metodo para insertar datos en la BD.
    public Telefono_Participante Insertar(String telefono){
        String transaccion = "INSERT INTO Telefono_Participante VALUES('"
                + telefono + "')";
        
        //llama al metodo Actualizar ubicado en DataBase.java.
        if(new DataBase().Actualizar(transaccion)>0){
            return new Telefono_Participante(telefono);
        }
        return null;
    }
    
    //Metodo para actualizar un registro en la BD.
    public int Actualizar(int id, String telefono){
        String transaccion = "UPDATE Telefono_Participante SET telefono='"
                + telefono + "' WHERE id_tipotelP="
                + id;
        
        return new DataBase().Actualizar(transaccion);
    }
    
    //Metodo para seleccionar todos los registros de la tabla.
    public List Obtenerdatos(){
        String transaccion = "SELECT * FROM Telefono_Participante";
        //Llama al metodo Listar de DataBase.java.
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arreglo de telefono_participante.
        List<Telefono_Participante> telefono_participante = new ArrayList();
        //Ciclo que recorre cada registro y los agrega al arreglo telefono_participante.
        for(Map registro : registros){
            Telefono_Participante tlp = new Telefono_Participante((int) registro.get("id_tipotelP"),
            (int) registro.get("id_pT"),
            (String) registro.get("telefono"));
            telefono_participante.add(tlp);
        }
        return telefono_participante;//Retorna todas las reservas ubicadas en la tabla BD.
    }
    
    //Metodo para eliminar un registro de la tabla en la BD.
    public int Eliminar(int id){
        String transaccion = "DELETE FROM Telefono_Participante WHERE id_tipotelP='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
