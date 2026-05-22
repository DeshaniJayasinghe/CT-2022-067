import java.util.Scanner;

class Temperature {
    private double celsius;

    public Temperature() {
        this.celsius = 0.0;
    }

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double toCelsius() {
        return this.celsius;
    }

    public double toFahrenheit() {
        return (this.celsius * 9 / 5) + 32;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double inputCelsius = scanner.nextDouble();

        Temperature temp = new Temperature(inputCelsius);

        System.out.println(temp.toCelsius() + " Celsius is equal to " + temp.toFahrenheit() + " Fahrenheit");

        scanner.close();
    }
}