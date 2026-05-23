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
//Acá no se llama a Notificacion si no a nuestro NotificacionDecorator
public class UrgenciaRojaDecorator extends NotificacionDecorator {

    public UrgenciaRojaDecorator(Notificacion notificacion) {
        super(notificacion);
        // super hace: llamar al constructor de la clase papa, en este caso -> NotificacionDecorator 
    }

    @Override
    public void enviar(String mensaje) {
        // Modificación de mensaje
        String mensajeModificado = "[URGENTE] " + mensaje;
        
        super.enviar(mensajeModificado);
        // super.enviar = decirle a la clase padre que ejecute el de arriba.
        // usa el codigo original, PERO nuestra versión modificada.
    }
}