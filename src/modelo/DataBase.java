/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;
import java.sql.*;

/**
 *
 * @author Kentry Gutter
 */
public class DataBase {

    private final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Tuor_OperadoraPT;"
            + "integratedSecurity=true;" + "encript=true;trustServerCertificate=true";

    private Connection conexion;

    public DataBase() {
        try {
            conexion = DriverManager.getConnection(URL);
            System.out.println("Conexión Establecida");
        } catch (SQLException e) {
            System.out.println("Error de conexión");
            e.printStackTrace();
        }
    }

    public int Actualizar(String consulta) {
        try {
            Statement st = conexion.createStatement();
            return st.executeUpdate(consulta);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private List OrganizarDatos(ResultSet rs) {
        List filas = new ArrayList();
        try {
            int numColumnas = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Map<String, Object> renglon = new HashMap();
                for (int i = 1; i <= numColumnas; i++) {
                    String nombreCampo = rs.getMetaData().getColumnName(i);
                    Object valor = rs.getObject(nombreCampo);
                    renglon.put(nombreCampo, valor);
                }

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
        } catch (SQLException e) {
            System.out.println("No se realizó la consulta ");
            e.printStackTrace();
        }
        return resultado;
    }

    public boolean ejecutarProcedimiento(String nombre) {
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
