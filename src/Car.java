public class Car {
    private String brand = "";

    private int constructionyear = 0;

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setConstructionYear(int newConstructionYear) {
        this.constructionyear = newConstructionYear;
    }

    public void drive() {
        System.out.println(this.brand + " from " + this.constructionyear + " goes brrrr brrrr");
    }
}
