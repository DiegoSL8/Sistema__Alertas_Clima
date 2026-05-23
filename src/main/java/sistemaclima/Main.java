/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaclima;

import sistemaclima.observer.*;
import sistemaclima.factory.*;
import sistemaclima.decorator.*;
import sistemaclima.modelo.DatosClima;
/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("---Sistema de alerta meteorologica---\n");

        // Se instancia el observer
        EstacionMeteorologica estacion = new EstacionMeteorologica();

        // Se instancia el factory
        NotificacionFactory factory = new NotificacionFactory();
        
        // 1. NOTIFICACION NORMAL (Solo factory)
        Notificacion notiNormal = factory.crearNotificacion("EMAIL");
        
        // 2. NOTIFICACION "URGENCIA" (Decorator)
        Notificacion notiUrgente = new UrgenciaRojaDecorator(factory.crearNotificacion("SMS"));
        
        // 3. NOTIFICACION "ENCRIPTADA" (Decorator)
        Notificacion notiSecreta = new EncriptacionDecorator(factory.crearNotificacion("EMAIL"));
        
        // 4. Creamos los dispositivos y les asignamos su tipo de notificación
        DispositivoUsuario d1 = new DispositivoUsuario("Pueblerino", notiNormal);
        DispositivoUsuario d2 = new DispositivoUsuario("Presidente", notiUrgente);
        DispositivoUsuario d3 = new DispositivoUsuario("Gobierno Irlandes", notiSecreta);

        // 5. Acá se añaden a la estacion (Observer)
        estacion.registrarObservador(d1);
        estacion.registrarObservador(d2);
        estacion.registrarObservador(d3);

        // 6. Lo que veremos:
        System.out.println("\n>>> OCURRIO UN CAMBIO CLIMATICO -- TODOS BAJO TECHO <<<");
        DatosClima tormenta = new DatosClima(15.0, 95.0); // Acá le damos los valores del la humedad y de la temperatura.
        estacion.setCondiciones(15.0, 95.0);
    }
}