package com.primersql;

import datos.Conexion;
import datos.PersonaDAO;
import datos.UsuarioDAO;
import domain.Persona;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Israel Sanchez Aguil
 */
public class TestManejoPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conexion = null;
        try {
             conexion = Conexion.getConexion();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            
            PersonaDAO personaDao = new PersonaDAO(conexion);
            Persona cambio = new Persona(2,"Pepe","Pollo","pollo@pollo.com","13e2313");
            personaDao.actualizar(cambio);
            Persona nueva = new Persona("REY","Hamburguesaffadllsdnfsnfksfnsfdkfnslgsdsfffdggddsdgssgg","BurgenKing@.com","23453635657");
            personaDao.insertar(nueva);
            conexion.commit();
            //Persona persona = new Persona("Juancho", "pepe", "abcdefg@.com","7788");
            // personaDao.insertar(persona);
        } catch (SQLException ex) {
            try {
                ex.printStackTrace(System.out);
                System.out.println("Entramos al rollback");
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
            }
    }
    
}
