// Overload a constructor for a Rectangle class:
// No-arg constructor (default size 1x1).
// Constructor with one parameter (square).
// Constructor with two parameters (width, height).

public class Section5 {
    private int length;
    private int width;

    public Section5() {
        this.length = 1;
        this.width = 1;

    }

    public Section5(int len) {
        this.length = len;
        this.width = len;

    }

    public Section5(int len, int wid) {
        this.length = len;
        this.width = wid;

    }

    public void area() {
        System.out.println("Area is: " + length * width + "sq. m.");
    }

    public static void main(String[] args) {
        Section5 myobj1 = new Section5();
        Section5 myobj2 = new Section5(50);
        Section5 myobj3 = new Section5(40, 50);
        myobj1.area();
        myobj2.area();
        myobj3.area();
    }

}