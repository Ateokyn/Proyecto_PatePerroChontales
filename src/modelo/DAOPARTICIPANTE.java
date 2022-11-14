
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;
/**
 *
 * @author Usuario
 */
public class DAOPARTICIPANTE {
    
    public Participante Insertar(String NOMBRE_PART,String ESTADO_PARTICIPANTE,String ESTADO_DEPOSITO,String ESTADO_TRANSPORTE, int EDAD_PART, int N_RESERVA){
        String transacciones = "Insert Into PARTICIPANTES Values('"
                + NOMBRE_PART + "','"
                + ESTADO_PARTICIPANTE + "','"
                + ESTADO_DEPOSITO + "','"
                + ESTADO_TRANSPORTE + "','"
                + EDAD_PART + "','"
                + N_RESERVA + "')";
        
        if(new DataBase().Actualizar(transacciones) > 0){
            return new Participante(NOMBRE_PART, ESTADO_PARTICIPANTE, ESTADO_DEPOSITO, ESTADO_TRANSPORTE, EDAD_PART,N_RESERVA);
        }
        return null;
    }
    public int Actualizar(int id, String NOMBRE_PART,String ESTADO_PARTICIPANTE,String ESTADO_DEPOSITO,String ESTADO_TRANSPORTE,int EDAD_PART, int N_RESERVA){
        String transaccion = "Update PARTICIPANTES Set NOMBRE_PART='"
                + NOMBRE_PART + "', ESTADO_PARTICIPANTE='"
                + ESTADO_PARTICIPANTE + "', ESTADO_DEPOSITO='"
                + ESTADO_DEPOSITO + "', ESTADO_TRANSPORTE='"
                + ESTADO_TRANSPORTE + "', EDAD_PART='"
                + EDAD_PART + "', N_RESERVA='"
                + N_RESERVA + "' Where NUMERO_LIST="
                + id;
        
        return new DataBase().Actualizar(transaccion);
    }
    
    public List ObtenerDatos(){
        String transaccion = "Select * From PARTICIPANTES";
        
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Participante> participante = new ArrayList();
        
        for(Map registro : registros){
            Participante part = new Participante((int) registro.get("NUMERO_LIST"),
            (String) registro.get("NOMBRE_PART"),
            (String) registro.get("ESTADO_PARTICIPANTE"),
            (String) registro.get("ESTADO_DEPOSITO"),
            (String) registro.get("ESTADO_TRANSPORTE"),
            (int) registro.get("EDAD_PART"),
            (int) registro.get("N_RESERVA"));
            participante.add(part);
        }
        return participante;
    }
    
    public int Eliminar(int id){
        String transaccion = "Delete From PARTICIPANTES Where N_RESERVA='" + id +"'";
        return new DataBase().Actualizar(transaccion);
    }
}
