package pro;

public class Rectangle implements Shape{
    private double height;

    private double width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height*width;
    }
}