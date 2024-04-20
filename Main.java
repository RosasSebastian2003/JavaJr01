public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Pantalla samsungSmartTv = new Pantalla();
        
        samsungSmartTv.setMarca(ScreenBrands.Samsung);
        
        Pantalla samsungSmartLedTv = new Pantalla("Negro", "Lcd SmartTV 24 in", "Samsung", "LED", 24, (float) 1123.80);
    }
}