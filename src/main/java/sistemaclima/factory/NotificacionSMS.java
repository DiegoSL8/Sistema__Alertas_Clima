/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaclima.factory;

/**
 *
 * @author diego
 */
public class NotificacionSMS implements Notificacion {
    
    @Override
    public void enviar(String mensaje) {
        // Lógica básica para simular el envío de un SMS
        System.out.println("[SMS] Enviando alerta urgente al movil: " + mensaje);
    }
}
