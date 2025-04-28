/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica61;

/**
 *
 * @author Paco
 */
public class Pijiphone extends Telefono {

    private Gps gpsConcreto;

    public Pijiphone(String colorIn) {
        super(colorIn, 700, "Pijiphone");
        this.gpsConcreto = new Gps();
    }

    @Override
    public void llamar() {
        super.llamar(); 
        System.out.println("Esta llamada va a ser grabada");
    }

    @Override
    public void cargar() {
        //logica }
    }

    public Gps getGpsConcreto() {
        return gpsConcreto;
    }

    public void setGpsConcreto(Gps gpsConcreto) {
        this.gpsConcreto = gpsConcreto;
    }
    
    
}
