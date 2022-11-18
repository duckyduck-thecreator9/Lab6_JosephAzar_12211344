/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_josephazar;

/**
 *
 * @author joseph
 */
public class Billetera {
    private int puntos_consumo;
    private double costo;

    public Billetera(int puntos_consumo, double costo) {
        this.puntos_consumo = puntos_consumo;
        this.costo = costo;
    }

    public int getPuntos_consumo() {
        return puntos_consumo;
    }

    public void setPuntos_consumo(int puntos_consumo) {
        this.puntos_consumo = puntos_consumo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Billetera{" + "puntos_consumo=" + puntos_consumo + ", costo=" + costo + '}';
    }
    
    
}
