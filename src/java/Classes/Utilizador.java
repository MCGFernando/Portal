/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author mfernando
 */
public class Utilizador {
    private long utilId ;
    private String utilLogin ;
    private String utilSenha;
    private String utilEmail;
    private Date utilDataRegisto;
    private Date utilDataModificada;
    private int utilStatus;

    public long getUtilId() {
        return utilId;
    }

    public void setUtilId(long utilId) {
        this.utilId = utilId;
    }

    public String getUtilLogin() {
        return utilLogin;
    }

    public void setUtilLogin(String utilLogin) {
        this.utilLogin = utilLogin;
    }

    public String getUtilSenha() {
        return utilSenha;
    }

    public void setUtilSenha(String utilSenha) {
        this.utilSenha = utilSenha;
    }

    public String getUtilEmail() {
        return utilEmail;
    }

    public void setUtilEmail(String utilEmail) {
        this.utilEmail = utilEmail;
    }

    public Date getUtilDataRegisto() {
        return utilDataRegisto;
    }

    public void setUtilDataRegisto(Date utilDataRegisto) {
        this.utilDataRegisto = utilDataRegisto;
    }

    public Date getUtilDataModificada() {
        return utilDataModificada;
    }

    public void setUtilDataModificada(Date utilDataModificada) {
        this.utilDataModificada = utilDataModificada;
    }

    public int getUtilStatus() {
        return utilStatus;
    }

    public void setUtilStatus(int utilStatus) {
        this.utilStatus = utilStatus;
    }
    
    
}
