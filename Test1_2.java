package baitap11;
public class Test1_2 {

    public static void main(String[] args) {

            // Test Constructors and toString(
        Circle2 c1 = new Circle2(1.1);
        System.out.println(c1);   // toString()
            Circle2 c2 = new Circle2(); // default constructor
            System.out.println(c2);

            // Test setter and getter
            c1.setRadius(2.2);
            System.out.println(c1);      // toString()
        System.out.println("radius is:"+ c1.getRadius());

            // Test getArea() and getCircumference()
        System.out.println("area is: "+ c1.getArea());
        System.out.println("circumference is: "+ c1.getCircumference());
    }
    }

