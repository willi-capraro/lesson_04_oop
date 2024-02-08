public class Rectangle {

    private int sideA = 0;
    private int sideB = 0;

    public Rectangle() {
        System.out.println("a new rectangle has been created");
    }
    public void setSideA (int newSideA ) {
        this.sideA = newSideA;
    }
    public void setSideB ( int newSideB) {
        this.sideB =  newSideB;
    }

    public int calcArea() {
        int area = this.sideA * this.sideB;
        return area;
    }
    public int calcPermimeter() {
       int perimeter =  ((this.sideB * 2) + (this.sideA * 2));
       return perimeter;
    }
    public boolean isSquare() {
        if (this.sideB == this.sideA) {
            return true;
        }
        else {
            return false;
        }

    }
    public void draw() {
        for (int q = 0; q < this.sideB; q++){
            System.out.println("");
            for (int i = 0; i < this.sideA; i++) {
                System.out.print("x");
            }
        }
    }
}
