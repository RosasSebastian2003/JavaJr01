public class Television extends Pantalla {
    boolean antena;
    int volume;
    
    Television(String color, String modelo, String marca, String tipo, int resolucion, float precio, boolean antena) {
        super(color, modelo, marca, tipo, resolucion, precio);

        this.antena = antena;
        volume = 0;
    }

    @Override
    public void reEscale() {
        System.out.println("print hdr encendido");
    }
}