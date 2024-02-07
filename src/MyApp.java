public class MyApp {

    public static void main(String[] args) {
        System.out.println("Hello world");
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
        k.drive();

    }

}
