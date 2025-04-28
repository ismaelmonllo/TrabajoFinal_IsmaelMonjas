/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica61;

/**
 *
 * @author Paco
 */
public class Android extends Telefono {

    public Android(String colorIn) {
        super(colorIn, 200, "&-roid");
    }

    public void pintar() {
        try {
            ProcessBuilder proceso = new ProcessBuilder("mspaint.exe");
            proceso.start();
        } catch (Exception e) {
            System.out.println("No encuentro el paint");
        }
    }

    @Override
    public void cargar() {
                
    }

}
