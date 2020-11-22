/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mfernando
 */
public class Conexao {

    public static Connection getConexao() {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
