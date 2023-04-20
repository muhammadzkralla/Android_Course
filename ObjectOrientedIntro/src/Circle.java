public class Circle extends Shape implements ShapeInterface {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int calcArea() {
        return (int) (3.14 * radius * radius);
    }

    @Override
    public int calc() {
        return (int) (3.14 * radius * radius);
    }
}
