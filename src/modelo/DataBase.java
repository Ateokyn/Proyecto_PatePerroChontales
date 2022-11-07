/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Kentry Gutter
 */
public class DataBase {

    //Cadena de conexion de la BD.
    private final String URL = "jdbc:sqlserver://localhost:1433;dataName=Nombre;"
            + "integratedSecurity=true;" + "encrypt=true;trustServerCertificate=true";

    //Conexion con la BD.
    private Connection conexion;

    //Constructor de la clase.
    public DataBase() {
        //Usando Driver conector y cadena de conexión para conectar BD.
        try {
            conexion = DriverManager.getConnection(URL);
            System.out.println("Conexión Establecida.");
        } catch (SQLException e) {
            //Caturando errores.
            System.out.println("Error de conexión.");
            e.printStackTrace();
        }
    }

    //Metodo para actualizar datos en la BD.
    public int Actualizar(String consulta) {
        //Para controlar los errores al realiza la conexión y transaccion en BD.
        try {
            Statement st = conexion.createStatement();
            return st.executeUpdate(consulta);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private List OrganizarDatos(ResultSet rs) {
        //Arreglo de elementos.
        List filas = new ArrayList();
        try {
            int numColumnas = rs.getMetaData().getColumnCount();
            //Recorre cada registro de la tabla.
            while (rs.next()) {
                Map<String, Object> renglon = new HashMap();
                //Se obtiene nombre de cada campo en la BD.
                for (int i = 1; i <= numColumnas; i++) {
                    String nombreCampo = rs.getMetaData().getColumnName(i);
                    Object valor = rs.getObject(nombreCampo);
                    //Por cada campo, se obtiene el nombre y el valor del mismo.
                    renglon.put(nombreCampo, valor);
                }
                //Se agrega al arreglo cada registro.
                filas.add(renglon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filas;
    }

    public List Listar(String consulta) {
        ResultSet rs = null;
        List resultado = new ArrayList();
        try {
            Statement st = conexion.createStatement();
            rs = st.executeQuery(consulta);
            resultado = OrganizarDatos(rs);
        } catch (Exception e) {
            System.out.println("No se realizo la consulta.");
            e.printStackTrace();
        }
        return resultado;
    }

    public boolean ejecutarProcedimientos(String nombre) {
        try {
            CallableStatement cs = conexion.prepareCall("{call" + nombre + "}");
            return cs.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

