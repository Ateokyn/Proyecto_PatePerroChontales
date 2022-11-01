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

        String transaccion = "INSERT INTO Cliente VALUES('"
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

        String transaccion = "UPDATE Cliente SET nombre_c'"
                + nombre_c + "' apellido_c1='"
                + apellido_c1 + "' apellido_c2='"
                + apellido_c2 + "' edad_c'"
                + edad_c + "' depart_c'"
                + depart_c + "' WHERE id_cliente="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    //Metodo para seleccionar todos los registro de la tabla Cliente.
    public List ObtenerDatos(int id) {
        String transaccion = "SELECT * FROM Cliente";
        //Llama al metodo Listar de DataBase.java.
        List<Map> registros = new DataBase().Listar(transaccion);
        //Arreglo cliente.
        List<Cliente> cliente = new ArrayList();
        //Ciclo que recorre cada registro del y loas agrega al arreglo cliente.
        for (Map registro : registros) {
            Cliente ct = new Cliente((int) registro.get("id_cliente"),
                    (String) registro.get("nombre_c"),
                    (String) registro.get("apellido_c1"),
                    (String) registro.get("apellido_c2"),
                    (int) registro.get("edad_c"),
                    (String) registro.get("depart_c"));
            
            cliente.add(ct);
        }
        //Retorno todos los clientes ubicados en la tabla de BD.
        return cliente;
    }
    
    //Metodo para eliminar un registro de cliente de la tabla de la BD.
    public int Eliminar(int id){
        String transaccion = "DELETE FROM id_cliente='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
}