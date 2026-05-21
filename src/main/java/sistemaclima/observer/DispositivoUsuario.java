/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaclima.observer;

import sistemaclima.factory.Notificacion;

/**
 * Actúa como un "Observador" concreto.
 * Representa un teléfono, pantalla o tablet de un usuario.
 */


//CLASE PENDIENTE DE FINALIZACION: A LA ESPERA DE NOTIFICACION 
public class DispositivoUsuario implements Observador {
    
    private String nombrePropietario;
    
    // Aquí conectamos el patrón Observer con el patrón Factory/Decorator
    private Notificacion metodoNotificacion;

    /**
     * Al crear un dispositivo, le decimos a quién pertenece 
     * y cómo prefiere ser notificado (SMS, Email, etc.)
     */
    public class DispositivoUsuario(String nombrePropietario, Notificacion metodoNotificacion) {
        this.nombrePropietario = nombrePropietario;
        this.metodoNotificacion = metodoNotificacion;
    }

    @Override
    public void actualizar(double temperatura, double humedad) {
        // 1. Armamos el texto del mensaje con los datos nuevos
        String mensaje = "Hola " + nombrePropietario + ". El clima actual es: " 
                         + temperatura + "°C y " + humedad + "% de humedad.";
        
        // 2. Usamos el método de notificación para enviarlo
        metodoNotificacion.enviar(mensaje);
    }
}