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

    private final String URL = "jdbc:sqlserver://localhost:1433;dataName=Nombre;"
            + "integratedSecurity=true;" + "encrypt=true;trustServerCertificate=true";

    private Connection conexion;
}
public DataBase(){
    try{
    conexion = DriverManager.getConnection(URL);
    System.out.println("Conexión Establecida.");
    }catch(SQLException e){
    System.out.println("Error de conexión.");
    e.printStackTrace();
}
}
