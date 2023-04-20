public class Rectangle extends Shape implements ShapeInterface {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int calcArea() {
        return (length * width);
    }

    @Override
    public int calc() {
        return (length * width);
    }
}
