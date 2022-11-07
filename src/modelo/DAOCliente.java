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
public class DAOCliente {
    //Metodo para ubicar datos en la BD.
    public Cliente Insertar(String nombre_c, String apellido_c1, String apellido_c2, int edad_c, String depart_c) {

        String transaccion = "INSERT INTO CLIENTE VALUES('"
                + nombre_c + "', '"
                + apellido_c1 + "', '"
                + apellido_c2 + "', '"
                + edad_c + "', '"
                + depart_c + "')";

        //Llama al metodo Actualizar ubicado en DataBase.java.
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Cliente(nombre_c, apellido_c1, apellido_c2, edad_c, depart_c);
        }
        return null;
    }

    //Metodo para actualizar un registro de las cliente en la BD.
    public int Actualizar(int id, String nombre_c, String apellido_c1, String apellido_c2, int edad_c, String depart_c) {

        String transaccion = "UPDATE CLIENTE SET NOMBRE_C='"
                + nombre_c + "', APELLIDO_C1='"
                + apellido_c1 + "', APELLIDO_C2='"
                + apellido_c2 + "', EDAD_C='"
                + edad_c + "', DEPART_C='"
                + depart_c + "' WHERE ID_CLIENTE="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    //Metodo para seleccionar todos los registro de la tabla Cliente.
    public List ObtenerDatos() {
        String transaccion = "SELECT * FROM CLIENTE";
        //Llama al metodo Listar de DataBase.java.
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arreglo cliente.
        List<Cliente> cliente = new ArrayList();
        //Ciclo que recorre cada registro del y loas agrega al arreglo cliente.
        for (Map registro : registros) {
            Cliente ct = new Cliente((Integer) registro.get("ID_CLIENTE"),
                    (String) registro.get("NOMBRE_C"),
                    (String) registro.get("APELLIDO_C1"),
                    (String) registro.get("APELLIDO_C2"),
                    (Integer) registro.get("EDAD_C"),
                    (String) registro.get("DEPART_C"));
            
            cliente.add(ct);
        }
        //Retorno todos los clientes ubicados en la tabla de BD.
        return cliente;
    }
    
    //Metodo para eliminar un registro de cliente de la tabla de la BD.
    public int Eliminar(int id){
        String transaccion = "DELETE FROM ID_CLIENTE='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}