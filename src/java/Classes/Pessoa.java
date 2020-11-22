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
public class Pessoa {
    private long pesIdPessoa;
    private String pesNome;
    private String pesApelido;
    private Date pesNescimento;
    private int pesGenero;
    private Date pesDataRegisto;
    private int pesStatus;
    private String pesBi;
    private Utilizador utilizador;
    private Municipio municipio;

    public long getPesIdPessoa() {
        return pesIdPessoa;
    }

    public void setPesIdPessoa(long pesIdPessoa) {
        this.pesIdPessoa = pesIdPessoa;
    }

    public String getPesNome() {
        return pesNome;
    }

    public void setPesNome(String pesNome) {
        this.pesNome = pesNome;
    }

    public String getPesApelido() {
        return pesApelido;
    }

    public void setPesApelido(String pesApelido) {
        this.pesApelido = pesApelido;
    }

    public Date getPesNescimento() {
        return pesNescimento;
    }

    public void setPesNescimento(Date pesNescimento) {
        this.pesNescimento = pesNescimento;
    }

    public int getPesGenero() {
        return pesGenero;
    }

    public void setPesGenero(int pesGenero) {
        this.pesGenero = pesGenero;
    }

    public Date getPesDataRegisto() {
        return pesDataRegisto;
    }

    public void setPesDataRegisto(Date pesDataRegisto) {
        this.pesDataRegisto = pesDataRegisto;
    }

    public int getPesStatus() {
        return pesStatus;
    }

    public void setPesStatus(int pesStatus) {
        this.pesStatus = pesStatus;
    }

    public String getPesBi() {
        return pesBi;
    }

    public void setPesBi(String pesBi) {
        this.pesBi = pesBi;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    
    
}
