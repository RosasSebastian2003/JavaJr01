public class Monitor extends Pantalla implements Funcionalidad {
    // Contrictor parametrado
    Monitor(String color, String modelo, String marca, String tipo, int resolucion, float precio) {
        super(color, modelo, marca, tipo, resolucion, precio);
    }
    // Metodos de la interfaz Funcionalidad
    @Override
    public void sonido() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sonido'");
    }

    @Override
    public Boolean conexion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'conexion'");
    }

    @Override
    public void brillo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'brillo'");
    }

    // Metodos de la clase pantalla
    @Override
    public void reEscale() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reEscale'");
    }
    
}
