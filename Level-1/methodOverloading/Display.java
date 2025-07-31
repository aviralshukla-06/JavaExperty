// Write a class Display with overloaded methods show():
// No parameters.
// One int parameter.
// One String parameter.

public class Display {

    public static void main(String[] args) {
        show();
        show("Hey Aviral");
        show(22);
    }

    static void show() {
        System.out.println("This function has no parameters");

    }

    static void show(int a) {
        System.out.println(a);
    }

    static void show(String str) {
        System.out.println(str);
    }
}