/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica61;

/**
 *
 * @author Paco
 */
public abstract class Telefono {

    // ATRIBUTOS
    private final String PUK;
    private double precio;
    private String color;
    private int bateria;
    private String marca;
    private int llamadas;
    private static int llamadasTotales;
    private Linterna linternita;

    // METODOS
    /**
     * constructor
     *
     * @param colorIn
     * @param precioIn
     * @param marcaIn
     */
    public Telefono(String colorIn, double precioIn, String marcaIn) {
        this.color = colorIn;
        this.PUK = "" + (int) Math.floor(Math.random() * 100000000);
        this.precio = precioIn;
        this.marca = marcaIn;
        this.llamadas = 0;
    }

    /**
     * metodo que hace una llamada
     *
     * suma uno al atributo llamada del objeto y a llamadas totales de la clase
     */
    public void llamar() {
        System.out.println("Piiii, piiiii...");
        this.esperar(4);
        System.out.println("---**CONVERSACION PRIVADA**---");
        this.esperar(5);
        System.out.println("pi pi pi, pi pi pi, ...");
        this.setLlamadas(this.getLlamadas() + 1);
        Telefono.setLlamadasTotales(Telefono.getLlamadasTotales() + 1);
    }

    /**
     * metodo que sirve para esperar
     *
     * @param segundos num segundos de espera
     */
    public void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * metodo abstractor que carga el movil
     */
    public abstract void cargar();

    // getters y setters
    public Linterna getLinternita() {
        return linternita;
    }

    public void setLinternita(Linterna linternita) {
        this.linternita = linternita;
    }

    public static int getLlamadasTotales() {
        return llamadasTotales;
    }

    public static void setLlamadasTotales(int llamadasTotales) {
        Telefono.llamadasTotales = llamadasTotales;
    }

    public int getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(int llamadas) {
        this.llamadas = llamadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPuk() {
        return PUK;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

}
