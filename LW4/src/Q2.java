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

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double inputFahrenheit = scanner.nextDouble();

        Temperature temp = new Temperature();
        temp.setFahrenheit(inputFahrenheit);

        System.out.println(inputFahrenheit + " Fahrenheit is equal to " + temp.toCelsius() + " Celsius");

        scanner.close();
    }
}
