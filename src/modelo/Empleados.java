/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Kentry Gutter
 */
public class Empleados {

    private int id_empleado;
    private String nombre_emp;
    private String apellido_emp1;
    private String apellido_p2;
    private String depart_emp;
    private String telefono_emp;
    private int edad_emp;

    public Empleados(int id_empleado, String nombre_emp, String apellido_emp1, String apellido_p2, String depart_emp, String telefono_emp, int edad_emp) {
        this.id_empleado = id_empleado;
        this.nombre_emp = nombre_emp;
        this.apellido_emp1 = apellido_emp1;
        this.apellido_p2 = apellido_p2;
        this.depart_emp = depart_emp;
        this.telefono_emp = telefono_emp;
        this.edad_emp = edad_emp;
    }

    public Empleados(String nombre_emp, String apellido_emp1, String apellido_p2, String depart_emp, String telefono_emp, int edad_emp) {
        this.nombre_emp = nombre_emp;
        this.apellido_emp1 = apellido_emp1;
        this.apellido_p2 = apellido_p2;
        this.depart_emp = depart_emp;
        this.telefono_emp = telefono_emp;
        this.edad_emp = edad_emp;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre_emp() {
        return nombre_emp;
    }

    public void setNombre_emp(String nombre_emp) {
        this.nombre_emp = nombre_emp;
    }

    public String getApellido_emp1() {
        return apellido_emp1;
    }

    public void setApellido_emp1(String apellido_emp1) {
        this.apellido_emp1 = apellido_emp1;
    }

    public String getApellido_p2() {
        return apellido_p2;
    }

    public void setApellido_p2(String apellido_p2) {
        this.apellido_p2 = apellido_p2;
    }

    public String getDepart_emp() {
        return depart_emp;
    }

    public void setDepart_emp(String depart_emp) {
        this.depart_emp = depart_emp;
    }

    public String getTelefono_emp() {
        return telefono_emp;
    }

    public void setTelefono_emp(String telefono_emp) {
        this.telefono_emp = telefono_emp;
    }

    public int getEdad_emp() {
        return edad_emp;
    }

    public void setEdad_emp(int edad_emp) {
        this.edad_emp = edad_emp;
    }

}
