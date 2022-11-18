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
public class Alimentos {
    private String nombre;
    private int costo;
    private String categoria;
    private int calorias;

    public Alimentos(String nombre, int costo, String categoria, int calorias) {
        this.nombre = nombre;
        this.costo = costo;
        this.categoria = categoria;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String ategoria) {
        this.categoria = ategoria;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    
        
}
