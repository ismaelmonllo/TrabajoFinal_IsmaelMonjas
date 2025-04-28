/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica61;

/**
 *
 * @author Paco
 */
public class Gps {

    // ATRIBUTOS
    private String ubicacion;

    //METODOS
    /**
     * constructor
     *
     */
    public Gps() {
        this.ubicacion = "Segovia";
    }

    /**
     * te dice donde estas
     * @return string
     */
    public String darUbicacion() {
        return "Estas en " + this.getUbicacion();
    }

    // getters y setters
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

}
