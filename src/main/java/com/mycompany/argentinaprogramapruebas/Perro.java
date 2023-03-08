/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.argentinaprogramapruebas;

/**
 *
 * @author nes
 */
public class Perro {
    
    private String nombre;
    
    private String colorPelo;

    public Perro(String nombre, String colorPelo) {
        this.nombre = nombre;
        this.colorPelo = colorPelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", colorPelo=" + colorPelo + '}';
    }
    
    
    
    
    
    
}
