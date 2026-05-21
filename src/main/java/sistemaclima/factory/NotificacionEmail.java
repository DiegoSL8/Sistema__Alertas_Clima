/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaclima.factory;

/**
 *
 * @author diego
 */
public class NotificacionEmail implements Notificacion {
    
    @Override
    public void enviar(String mensaje) {
        // Lógica básica para simular el envío de un Email
        System.out.println("[EMAIL] Enviando alerta meteorológica: " + mensaje);
    }
}
