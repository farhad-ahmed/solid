package amateur;

import java.util.List;

/*
This is a amateur way to write a class.
What will happen if we want to add another shape?
Obviously we need to refactor this method again.
 */
public class AreaCalculator {

    public static double aggregateArea(List<Object> shapeList) {
        double total = 0;

        for (Object shape : shapeList) {
            if (shape instanceof Rectangle) {
                total += ((Rectangle) shape).getHeight() * ((Rectangle) shape).getWidth();
            }

            if (shape instanceof Square) {
                total += ((Square) shape).getHeight() * ((Square) shape).getHeight();
            }
        }

        return total;
    }

    public static void main(String[] args) {
        double sumOfArea = aggregateArea(List.of(new Rectangle(5,2), new Square(10)));
        System.out.println("sum of area is: "+sumOfArea);
    }
}