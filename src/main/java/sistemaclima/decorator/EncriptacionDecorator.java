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
public class EncriptacionDecorator extends NotificacionDecorator {

    public EncriptacionDecorator(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar(String mensaje) {
        // Se cambian las vocales automaticamente por simbolos y numeros.
        String mensajeCodificado = mensaje.replace("a", "@")
                                          .replace("e", "3")
                                          .replace("i", "1")
                                          .replace("o", "0")
                                          .replace("u", "#");
                                          
        String mensajeFinal = "[ENCRIPTADO] " + mensajeCodificado;
        
        super.enviar(mensajeFinal);
    }
}