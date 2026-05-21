/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaclima.modelo;

/**
 * Clase modelo que representa la información del clima en un momento dado.
 * Es una clase pura de datos (POJO).
 */
public class DatosClima {
    
    private double temperatura;
    private double humedad;

    // Constructor
    public DatosClima(double temperatura, double humedad) {
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

    // Getters para que otras clases puedan leer los datos si lo necesitan
    public double getTemperatura() {
        return temperatura;
    }

    public double getHumedad() {
        return humedad;
    }
}