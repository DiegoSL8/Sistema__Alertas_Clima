/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaclima.factory;

/**
 *
 * @author diego
 */
public class NotificacionFactory {

    /**
     * Método fábrica que centraliza la creación de objetos de notificación.
     * @param tipo El tipo de notificación que se requiere ("EMAIL" o "SMS").
     * @return Una instancia concreta de Notificacion, o null si el tipo no es válido.
     */
    public static Notificacion crearNotificacion(String tipo) {
        if (tipo == null) {
            return null;
        }
        
        // Evaluamos el tipo ignorando mayúsculas/minúsculas para evitar errores tipográficos
        switch (tipo.toUpperCase().trim()) {
            case "EMAIL":
                return new NotificacionEmail();
            case "SMS":
                return new NotificacionSMS();
            default:
                System.out.println("Error: El tipo de notificación '" + tipo + "' no está soportado por la fábrica.");
                return null;
        }
    }
}
