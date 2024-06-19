import java.util.Scanner;

public class SequenceExample {
    private double length;
    private double width;
    private double area;

    public SequenceExample setLength(double length) {
        this.length = length;
        return this;
    }

    public SequenceExample setWidth(double width) {
        this.width = width;
        return this;
    }

    public SequenceExample calculateArea() {
        this.area = length * width;
        return this;
    }

    public void printArea() {
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is: " + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SequenceExample calculator = new SequenceExample();
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        calculator.setLength(length);

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        calculator.setWidth(width);
        calculator.calculateArea().printArea();
        scanner.close();
    }
}
