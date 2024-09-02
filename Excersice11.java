 public class Excersice11 {

    public static void main(String[] args) {

        Triangle my = new Triangle(1, 1.5, 1);
        my.setColor("yellow");
        my.setFilled(true);
        System.out.println("Triangle area: " + my.getArea());
        System.out.println("Triangle perimeter: " + my.getPerimeter());
        System.out.println("Triangle color: " + my.getColor());
        System.out.println("Triangle filled? " + my.isFilled());
        System.out.println(my);
    }
 }