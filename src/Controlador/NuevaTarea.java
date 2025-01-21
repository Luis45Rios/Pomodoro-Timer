/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Steven
 */
public class NuevaTarea {
    private String nombre;
    private Integer tiempoEnfoque;
    
    public void guardarNombre (String nombre) {
        this.nombre = nombre;
    }
    
    public void guardarEnfoque (Integer tiempo) {
        this.tiempoEnfoque = tiempo;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public Integer obtenerTiempoEnfoque() {
        return tiempoEnfoque;
    }
}
