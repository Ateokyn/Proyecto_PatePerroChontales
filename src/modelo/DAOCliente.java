/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;
/**
 *
 * @author Kentry Gutter
 */
public class DAOCLIENTE {
    
    public Cliente Insertar(String NOMBRE_C,String APELLIDO_C1,String APELLIDO_C2,int EDAD_C,String DEPART_C){
        
        String transacciones = "Insert Into CLIENTE Values('"
                + NOMBRE_C + "','"
                + APELLIDO_C1 + "','"
                + APELLIDO_C2 + "',"
                + EDAD_C + ",'"
                + DEPART_C + "')";
        
        if(new DataBase().Actualizar(transacciones)>0){
            return new Cliente(NOMBRE_C, APELLIDO_C1, APELLIDO_C2, EDAD_C, DEPART_C);
        }
        return null;
    }
    
    public int Actualizar(int id, String NOMBRE_C,String APELLIDO_C1, String APELLIDO_C2,int EDAD_C,String DEPART_C){
        
        String transaccion = "Update CLIENTE Set NOMBRE_C='"
                + NOMBRE_C + "', APELLIDO_C1='"
                + APELLIDO_C1 + "', APELLIDO_C2='"
                + APELLIDO_C2 + "', EDAD_C="
                + EDAD_C + ", DEPART_C='"
                + DEPART_C + "' Where ID_CLIENTE="
                + id ;
        
        return new DataBase().Actualizar(transaccion);
    }
    
    public List ObtenerDatos(){
        String transaccion = "Select * From CLIENTE";
        
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Cliente> cliente = new ArrayList();
        
        for(Map registro : registros){
            Cliente cln = new Cliente((int) registro.get("ID_CLIENTE"),
            (String) registro.get("NOMBRE_C"),
            (String) registro.get("APELLIDO_C1"),
            (String) registro.get("APELLIDO_C2"),
            (int) registro.get("EDAD_C"),
            (String) registro.get("DEPART_C"));
            cliente.add(cln);
        }
        return cliente;
    }
    
    public int Eliminar(int id){
        String transaccion = "Delete From CLIENTE Where ID_CLIENTE='" + id +"'";
        return new DataBase().Actualizar(transaccion);
    }
}
