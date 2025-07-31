// Create a method printDetails to print employee details. Overload it to accept:
// Name only.
// Name and Age.
// Name, Age, and Salary.

public class Section4 {

    public static void main(String[] args) {
        printEmpDetails("Aviral");
        printEmpDetails("Aviral", 22);
        printEmpDetails("Aviral", 22, 1500000);
    }

    static void printEmpDetails(String name) {
        System.out.println(name);
    }

    static void printEmpDetails(String name, int Age) {
        System.out.println("Name: " + name + " Age: " + Age);
    }

    static void printEmpDetails(String name, int Age, int Salary) {
        System.out.println("Name: " + name + " Age: " + Age + " Salary : " + Salary);
    }
}