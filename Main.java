public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Pantalla samsungSmartTv = new Pantalla();
        
        //samsungSmartTv.setMarca(ScreenBrands.Samsung);
        
        Television samsungSmartLedTv = new Television("Negro", "Lcd SmartTV 24 in", "Samsung", "LED", 24, (float) 1123.80, true); 

        System.out.println(samsungSmartLedTv.color);
    }
}