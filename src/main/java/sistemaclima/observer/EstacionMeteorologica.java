/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaclima.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * Actúa como el "Sujeto" en el patrón Observer.
 * Es la torre central que detecta el clima y avisa a los demás.
 */
public class EstacionMeteorologica implements Sujeto {
    
    // Nuestra "libreta de contactos" donde anotamos quién quiere recibir alertas
    private List<Observador> observadores;
    
    // El estado interno (el clima actual)
    private double temperatura;
    private double humedad;

    // El constructor inicializa la lista vacía al encender la estación
    public EstacionMeteorologica() {
        this.observadores = new ArrayList<>();
    }

    @Override
    public void registrarObservador(Observador o) {
        observadores.add(o); // Añadimos un dispositivo a la libreta
    }

    @Override
    public void eliminarObservador(Observador o) {
        observadores.remove(o); // Eliminamos un dispositivo si ya no quiere alertas
    }

    @Override
    public void notificarObservadores() {
        // Recorremos la libreta y le pasamos los datos nuevos a cada uno
        for (Observador observador : observadores) {
            observador.actualizar(temperatura, humedad);
        }
    }

    /**
     * Este es el método que usaremos en la Demo para "simular" 
     * que los sensores reales detectaron un cambio en el clima.
     */
    public void setCondiciones(double temperatura, double humedad) {
        this.temperatura = temperatura;
        this.humedad = humedad;
         
        // Apenas cambia el clima, disparamos la notificación automática.
        notificarObservadores();
    }
}