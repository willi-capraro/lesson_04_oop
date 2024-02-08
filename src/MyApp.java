public class MyApp {

    public static void main(String[] args) {
        /*ystem.out.println("Hello world");
        Human h = new Human();
        Car c = new Car();
        Car k = new Car();

        h.setName("Herbert");
        c.setBrand("Mercedes");
        k.setBrand("Opel AMG");
        k.setConstructionYear(2008);
        c.setConstructionYear(2024);
        h.introduce();
        c.drive();
        k.drive();*/

        Rectangle r1 = new Rectangle();
        r1.setSideA(5);
        r1.setSideB(4);
        int area1 = r1.calcArea();
        System.out.println("the area of rectangle 1 is: " + area1);
        int perimeter1 = r1.calcPermimeter();
        System.out.println("the perimeter of rectangle 1 is: " + perimeter1);

        Rectangle r2 = new Rectangle();
        r2.setSideA(5);
        r2.setSideB(10);
        if (r2.isSquare()) {
            System.out.println("r2 is a square, my friend!");
        }
        else {
            System.out.println("r2 is no square, my friend!");
        }
        int area2 = r2.calcArea();
        System.out.println("the area of rectangle 2 is: " + area2);
        int perimeter2 = r2.calcPermimeter();
        System.out.println("the perimeter of rectangle 2 is: " + perimeter2);

        if (area2 > area1) {
            System.out.println("r2 is bigger");
        }
        else {
            System.out.println("r1 is bigger or the same size");
        }
    }

}
