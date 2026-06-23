class Main {

    interface Shape {
        double calculateArea();
    }

    static class Rectangle implements Shape {
        double length;
        double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double calculateArea() {
            return length * width;
        }
    }

    static class Circle implements Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;

        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }

        return totalArea;
    }

    public static void main(String[] args) {
        Main calculator = new Main();

        Shape[] shapes = {
            new Rectangle(5, 4),
            new Circle(3)
        };

        System.out.println("Total Area = " +
                calculator.calculateTotalArea(shapes));
    }
}
