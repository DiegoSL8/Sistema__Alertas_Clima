/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaclima.decorator;

import sistemaclima.factory.Notificacion;


/**
 *
 * @author diego
 */

//Guarda una notificación generica que van a usar el resto de clases en este package
public abstract class NotificacionDecorator implements Notificacion {
    
    protected Notificacion notificacion_Decorator;

    public NotificacionDecorator(Notificacion notificacion) {
        this.notificacion_Decorator = notificacion;
    }

    @Override
    public void enviar(String mensaje) {
        //Acá no hace nada, solo lo guarda
        notificacion_Decorator.enviar(mensaje);
    }
}
