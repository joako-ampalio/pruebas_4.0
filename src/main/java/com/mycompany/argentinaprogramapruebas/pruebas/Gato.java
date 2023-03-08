/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.argentinaprogramapruebas.pruebas;

/**
 *
 * @author nes
 */
public class Gato {
    
    private String nombre;
    private String tamaño;
    private String raza;
    private int edad;

    public Gato(String nombre, String tamaño, String raza, int edad) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.raza = raza;
        this.edad = edad;
    }

    public Gato() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", tama\u00f1o=" + tamaño + ", raza=" + raza + ", edad=" + edad + '}';
    }
    
    
    
    
}
