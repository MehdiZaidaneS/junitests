public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        double celsius = converter.fahrenheitToCelsius(100);
        System.out.println("100°F = " + celsius + "°C");
    }
}