/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;

/**
 *
 * @author mfernando
 */
public class Excluir {

    private Connection con;

    public Excluir() {
        con = Conexao.Conexao.getConexao();
    }

}
