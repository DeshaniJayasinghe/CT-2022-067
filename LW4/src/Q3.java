import java.util.Scanner;

class Circle {
    private double radius;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return 3.14159 * this.radius * this.radius;
    }

    public double computeCircumference() {
        return 2 * 3.14159 * this.radius;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the inner circle (ri): ");
        double ri = scanner.nextDouble();

        System.out.print("Enter the radius of the outer circle (ro): ");
        double ro = scanner.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle();
        outerCircle.setRadius(ro);

        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

        System.out.println("The area of the shaded circular region is: " + shadedArea);

        scanner.close();
    }
}
