/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaclima;

import sistemaclima.factory.Notificacion;
import sistemaclima.factory.NotificacionFactory;
import sistemaclima.observer.DispositivoUsuario;
import sistemaclima.observer.EstacionMeteorologica;
import sistemaclima.decorator.UrgenciaRojaDecorator;
import sistemaclima.decorator.EncriptacionDecorator;

/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("---Sistema de alerta meteorologica---\n");

        // Se instancia el observer (sujeto)
        EstacionMeteorologica estacionIquique = new EstacionMeteorologica(); //ver clima local
        EstacionMeteorologica estacionDublin = new EstacionMeteorologica(); // ver clima dublin 
        
        //Factory para crear las notificaciones BASE
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
        DispositivoUsuario d3 = new DispositivoUsuario("Gobierno Irlandes", notiSecreta);// El Gobierno se suscribe pero quire su clima obvio

        // 5. Acá se añaden a la estacion (Observer)
        estacionIquique.registrarObservador(d1); // 
        estacionIquique.registrarObservador(d2);
        estacionDublin.registrarObservador(d3); //como le creamos una torre para observar el clima de dublin, le añadimos su estacion necesaria

        // 6. Lo que veremos:
        System.out.println("\n>>> OCURRIO UN CAMBIO CLIMATICO -- TODOS BAJO TECHO <<<");
        // Esto solo le enviará la alerta a d1 Y d2(CLIMA LOCAL)
        estacionIquique.setCondiciones(28.5, 40.0); 

        // Esto solo le enviará la alerta encriptada a d3 (CLIMA DUBLIN)
        estacionDublin.setCondiciones(5.0, 95.0);    }
        }