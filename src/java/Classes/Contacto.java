/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author mfernando
 */
public class Contacto {
    private long contIdContacto;
    private String conttelefone;
    private String contEmail;
    private Pessoa pessoa;

    public long getContIdContacto() {
        return contIdContacto;
    }

    public void setContIdContacto(long contIdContacto) {
        this.contIdContacto = contIdContacto;
    }

    public String getConttelefone() {
        return conttelefone;
    }

    public void setConttelefone(String conttelefone) {
        this.conttelefone = conttelefone;
    }

    public String getContEmail() {
        return contEmail;
    }

    public void setContEmail(String contEmail) {
        this.contEmail = contEmail;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
}
