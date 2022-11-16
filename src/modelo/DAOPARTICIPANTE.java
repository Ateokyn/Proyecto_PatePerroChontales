
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
public class DAOPARTICIPANTE {

    public Participante Insertar(String NOMBRE_PART1, String NOMBRE_PART2, String ESTADO_P, String ESTADO_DEPO, String ESTADO_TRANSP, java.sql.Date FECHANAC_PART, int N_RESERVA) {
        String transacciones = "Insert Into PARTICIPANTES Values('"
                + NOMBRE_PART1 + "','"
                + NOMBRE_PART2 + "','"
                + ESTADO_P + "','"
                + ESTADO_DEPO + "','"
                + ESTADO_TRANSP + "','"
                + FECHANAC_PART + "','"
                + N_RESERVA + "')";

        if (new DataBase().Actualizar(transacciones) > 0) {
            return new Participante(NOMBRE_PART1, NOMBRE_PART2, ESTADO_P, ESTADO_DEPO, ESTADO_TRANSP, FECHANAC_PART, N_RESERVA);
        }
        return null;
    }

    public int Actualizar(int id, String NOMBRE_PART1, String NOMBRE_PART2, String ESTADO_P, String ESTADO_DEPO, String ESTADO_TRANSP, java.sql.Date FECHANAC_PART, int N_RESERVA) {
        String transaccion = "Update PARTICIPANTES Set NOMBRE_PART1='"
                + NOMBRE_PART1 + "', NOMBRE_PART2='"
                + NOMBRE_PART2 + "', ESTADO_P='"
                + ESTADO_P + "', ESTADO_DEPO='"
                + ESTADO_DEPO + "', ESTADO_TRANSP='"
                + ESTADO_TRANSP + "', FECHANAC_PART='"
                + FECHANAC_PART + "', N_RESERVA='"
                + N_RESERVA + "' Where NUMERO_LIST="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    public List ObtenerDatos() {
        String transaccion = "Select * From PARTICIPANTES";

        List<Map> registros = new DataBase().Listar(transaccion);
        List<Participante> participante = new ArrayList();

        for (Map registro : registros) {
            Participante part = new Participante((int) registro.get("NUMERO_LIST"),
                    (String) registro.get("NOMBRE_PART1"),
                    (String) registro.get("NOMBRE_PART2"),
                    (String) registro.get("ESTADO_P"),
                    (String) registro.get("ESTADO_DEPO"),
                    (String) registro.get("ESTADO_TRANSP"),
                    (java.sql.Date) registro.get("FECHANAC_PART"),
                    (int) registro.get("N_RESERVA"));
            participante.add(part);
        }
        return participante;
    }

    public int Eliminar(int id) {
        String transaccion = "Delete From PARTICIPANTES Where N_RESERVA='" + id + "'";
        return new DataBase().Actualizar(transaccion);
    }
}
