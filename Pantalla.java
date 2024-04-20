public class Pantalla {
    String color;
    String tipo; 
    float precio;
    boolean isOn;

    private String modelo;
    private String marca;
    private int resolucion;

    Pantalla() {

    }

    // Constructor parametrado
    Pantalla(String color, String modelo, String marca, String tipo, int resolucion, float precio) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.resolucion = resolucion;
        this.precio = precio;

        isOn = false;
    }

    void isOn() {
        if (isOn) {
            System.out.println("La pantalla está encendida"); 
        } else {
            System.out.println("La pantalla esta apagada");
        }
    }

    private boolean toggle() {
        if (isOn) {
            isOn = false;
            return isOn;
        } else {
            isOn = true;
            return isOn;
        }
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getResolucion() {
        return resolucion;
    }

    // Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // String como parametro
    public void setMarca(String marca){
        this.marca = marca;
    }

    // Enumerador como atributo
    public void setMarca(ScreenBrands marca) {
        this.marca = marca.toString();
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
}
