/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica61;

/**
 *
 * @author Paco
 */
public class Linterna {

    private boolean encendido;

    public void encender() {
        System.out.println("Mucha luz!");
        this.setEncendido(true);
    }
    
    public void apagar(){
        System.out.println("Se va la luz");
        this.setEncendido(false);
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    
}

