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
class Municipio {
    private int munIdMunicipio;
    private String munMunicipio;
    private Provincia provincia;

    public int getMunIdMunicipio() {
        return munIdMunicipio;
    }

    public void setMunIdMunicipio(int munIdMunicipio) {
        this.munIdMunicipio = munIdMunicipio;
    }

    public String getMunMunicipio() {
        return munMunicipio;
    }

    public void setMunMunicipio(String munMunicipio) {
        this.munMunicipio = munMunicipio;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
    
}
