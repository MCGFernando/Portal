/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;

/**
 *
 * @author mfernando
 */
public class Inserir {

    private Connection con;

    public Inserir() {
        con = Conexao.Conexao.getConexao();
    }

    public int inserirObjecto(String sql, Object... obj) {
        try (PreparedStatement stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);) {
            setStatement(stmt, obj);
            if (stmt.executeUpdate() > 0) {
                ResultSet r = stmt.getGeneratedKeys();
                if (r.next()) {
                    return r.getInt(1);
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return -1;
    }

    public void setStatement(PreparedStatement stmt, Object[] arrayObj) throws SQLException {
        int index = 1;
        for (Object obj : arrayObj) {
            if (obj instanceof String) {
                stmt.setString(index, (String) obj);
            } else if (obj instanceof Double) {
                stmt.setDouble(index, (Double) obj);
            } else if (obj instanceof Date) {
                stmt.setDate(index, obj != null ? new java.sql.Date((long) obj) : null);
            } else if (obj instanceof Long) {
                stmt.setLong(index, (Long) obj);
            } else if (obj instanceof Integer) {
                stmt.setInt(index, (Integer) obj);
            }
            index++;
        }
    }

    public void close() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Inserir.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con = null;
        }
    }
}
