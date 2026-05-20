/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaclima.factory;

/**
 * Interfaz base para el patrón Factory Method y Decorator.
 * Define el comportamiento estándar de cualquier notificación.
 */
public interface Notificacion {
    // Todos los tipos de notificación deben saber cómo enviarse
    void enviar(String mensaje);
}