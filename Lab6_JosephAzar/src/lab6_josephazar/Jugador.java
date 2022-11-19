/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_josephazar;

import java.util.ArrayList;

/**
 *
 * @author joseph
 */
public class Jugador {
    private String nombre;
    private String usuario;//unico
    private int nivel;
    private int consumo;
    private Alimentos alimento;
    private ArrayList<Jugador> amigos;
    private ArrayList<Solicitud> solicitudes;
    private Billetera billetera;    

    public Jugador(String nombre, String usuario, int nivel, int consumo, Alimentos alimento, ArrayList<Jugador> amigos, ArrayList<Solicitud> solicitudes, Billetera billetera) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.nivel = nivel;
        this.consumo = consumo;
        this.alimento = alimento;
        this.amigos = amigos;
        this.solicitudes = solicitudes;
        this.billetera = billetera;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    

    public Jugador() {
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Alimentos getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimentos alimento) {
        this.alimento = alimento;
    }

    public ArrayList<Jugador> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Jugador> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public Billetera getBilletera() {
        return billetera;
    }

    public void setBilletera(Billetera billetera) {
        this.billetera = billetera;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", usuario=" + usuario + ", nivel=" + nivel + ", alimento=" + alimento + ", amigos=" + amigos + ", solicitudes=" + solicitudes + ", billetera=" + billetera + '}';
    }
    
    
}
