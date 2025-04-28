/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica61;

/**
 *
 * @author Paco
 */
public class Practica61 {

    public static void main(String[] args) {

        // Crear un Pijiphone
        Pijiphone miPiji = new Pijiphone("azul");
        System.out.println("Prueba 1: llamada con pijiphone");
        miPiji.llamar();

        // Mostrar ubicacion usando GPS del Pijiphone
        System.out.println("\nPrueba 2: obtener ubicacion de pijiphone");
        System.out.println("Ubicacion actual del Pijiphone: " + miPiji.getGpsConcreto().darUbicacion());

        // Crear un Android
        Android miAndroid = new Android("negro");
        System.out.println("\nPrueba 3: llamada con Android");
        miAndroid.llamar();

        // Mostrar estadisticas de llamadas
        System.out.println("\nPrueba 4: comprobamos el contador de llamadas de cada telefono");
        System.out.println("Llamadas hechas por Pijiphone: " + miPiji.getLlamadas());
        System.out.println("Llamadas hechas por Android: " + miAndroid.getLlamadas());
        System.out.println("\nPrueba 5: comprobamos el contados de llamadas de la clase");
        System.out.println("Llamadas totales (clase Telefono): " + Telefono.getLlamadasTotales());

    }

}
