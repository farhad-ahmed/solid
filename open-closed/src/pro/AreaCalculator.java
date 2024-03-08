package pro;

import java.util.List;

public class AreaCalculator {

    public static double aggregateArea(List<Shape> shapeList) {
        double total = 0;

        for(Shape shape: shapeList){
            total+= shape.calculateArea();
        }

        return total;
    }

    public static void main(String[] args) {
        double sumOfArea = aggregateArea(List.of(new Rectangle(5,2), new Square(10)));
        System.out.println("sum of area is: "+sumOfArea);
    }
}