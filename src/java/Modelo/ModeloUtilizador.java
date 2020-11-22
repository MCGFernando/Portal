/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Classes.Utilizador;
import DAO.Inserir;

/**
 *
 * @author mfernando
 */
public class ModeloUtilizador {

    public ModeloUtilizador() {
    }
    
    public int inserirUtilizador(Utilizador u){
        final String sql = "INSERT INTO utilizador (util_login, util_senha, util_email, util_data_registo, util_data_modificada, util_status)"
                + " VALUES (?,?,?,?,?,?)";
        return new Inserir().inserirObjecto(sql, u);
    }
}
