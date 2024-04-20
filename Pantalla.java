public class Pantalla {
    String color, modelo, marca, tipo;
    int resolucion;
    float precio;
    boolean isOn;

    void isOn() {
        if (isOn) {
            System.out.println("La pantalla está encendida"); 
        } else {
            System.out.println("La pantalla esta apagada");
        }
    }

    boolean toggle() {
        if (isOn) {
            isOn = false;
            return isOn;
        } else {
            isOn = true;
            return isOn;
        }
    }
}
