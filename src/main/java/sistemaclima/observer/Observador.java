/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaclima.observer;

/**
 * Interfaz para el patrón Observer.
 * Todo dispositivo que quiera recibir alertas debe implementar esta interfaz.
 */
public interface Observador {
    // Se ejecuta automáticamente cuando la estación detecta un cambio
    void actualizar(double temperatura, double humedad);
}