/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;
/**
 *
 * @author Usuario
 */
public class DAORESERVA {
    
    public Reserva Insertar(java.sql.Date FECHA_RESERVA,int ID_GIRA,int ID_CLIENTE){
        String transacciones = "Insert Into RESERVAS Values('"
                + FECHA_RESERVA + "','"
                + ID_GIRA + "','"
                + ID_CLIENTE + "')";
        
        if(new DataBase().Actualizar(transacciones) > 0){
            return new Reserva(FECHA_RESERVA, ID_GIRA, ID_CLIENTE);
        }
        return null;
    }
    
    public int Actualizar(int id,java.sql.Date FECHA_RESERVA, int ID_GIRA, int ID_CLIENTE){
        String transaccion = "Update RESERVAS Set FECHA_RESERVA='"
                + FECHA_RESERVA + "', ID_GIRA='"
                + ID_GIRA + "', ID_CLIENTE='"
                + ID_CLIENTE + "' Where N_RESERVA="
                + id;
        
        return new DataBase().Actualizar(transaccion);
    }
    
    public List ObtenerDatos(){
        String transaccion = "Select * From RESERVAS";
        
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Reserva> reserva = new ArrayList();
        
        for(Map registro : registros){
            Reserva reser = new Reserva((int) registro.get("N_RESERVA"),
            (java.sql.Date) registro.get("FECHA_RESERVA"),
            (int) registro.get("ID_GIRA"),
            (int) registro.get("ID_CLIENTE"));
            reserva.add(reser);
            
        }
        return reserva;
    }
    public int Eliminar(int id){
        String transaccion = "Delete From RESERVAS Where N_RESERVA='" + id +"'";
        return new DataBase().Actualizar(transaccion);
    }
}
