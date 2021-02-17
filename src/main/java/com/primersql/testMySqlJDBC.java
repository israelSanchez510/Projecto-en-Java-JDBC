package com.primersql;

import java.sql.*;

/**
 *
 * @author Israel Sanchez Aguilar
 */
public class testMySqlJDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false"
                + "&useTimezone=true=&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "OnePiece");
            Statement instruccion = conexion.createStatement();
            String sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";

            ResultSet resultado = instruccion.executeQuery(sql);
            while (resultado.next()) {
                System.out.println("Id persona: " + resultado.getInt("id_persona"));
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } /*catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        } */ catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
