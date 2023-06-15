package home.work6;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(double sideA) {
        this.sideA = sideA;
        sideB = 5;
    }

    public Rectangle() {
        sideA = 4;
        sideB = 3;
    }

    public double getSideA() {
        if (sideA <= 0) throw new IllegalArgumentException("exception");
        else return sideA;
    }

    public double getSideB() {
        if (sideB <= 0) throw new IllegalArgumentException("exception");
        else return sideB;
    }

    public double area() {
        if (sideA <= 0 || sideB <= 0) throw new IllegalArgumentException();
        else return sideA * sideB;
    }

    public double perimeter() {
        if (sideA <= 0 || sideB <= 0) throw new IllegalArgumentException();
        else return (sideB + sideA) * 2;
    }

    public boolean isSquare() {
        if (sideA <= 0 || sideB <= 0) throw new IllegalArgumentException();
        else if (sideA == sideB) {
            return true;
        } else return false;
    }

    public void replaceSides() {
        if (sideA <= 0 || sideB <= 0) throw new IllegalArgumentException();
        else {
            double swap = sideA;
            sideA = sideB;
            sideB = swap;
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
