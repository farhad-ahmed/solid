package pro;

public class Square implements Shape{
    private double height;

    public Square(int height) {
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return height*height;
    }
}