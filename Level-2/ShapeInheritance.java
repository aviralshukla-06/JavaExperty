public class ShapeInheritance {

    public static void main(String[] args) {
        // Shape myShape = new Shape();
        Circle myCircle = new Circle();
        Rectangle myRectangle = new Rectangle();
        Triangle myTriangle = new Triangle();

        myCircle.setDetails("Circle", 0);
        myCircle.printDetails();
        myRectangle.setDetails("Rectangle", 4);
        myRectangle.printDetails();
        myTriangle.setDetails("Triangle", 3);
        myTriangle.printDetails();
        // myShape.printDetails();

    }
}

class Shape {
    String type;
    int noOfSides;

    public void setDetails(String type, int noOfSides) {
        this.type = type;
        this.noOfSides = noOfSides;
    }

    public void printDetails() {
        System.out.println(type + " has " + noOfSides + " sides");
    }

}

class Circle extends Shape {
    @Override
    public void setDetails(String type, int noOfSides) {
        super.setDetails(type, noOfSides);
        System.out.println(type + "Has circumferance and diameter");
    }

}

class Rectangle extends Shape {
    @Override
    public void setDetails(String type, int noOfSides) {
        super.setDetails(type, noOfSides);
        System.out.println(type + "Has length and width");
    }
}

class Triangle extends Shape {
    @Override
    public void setDetails(String type, int noOfSides) {
        super.setDetails(type, noOfSides);
        System.out.println(type + "Has circumcenter and centroids");
    }
}
