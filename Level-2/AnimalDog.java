public class AnimalDog {

    public static void main(String[] args) {
        Dog myDdog = new Dog();
        myDdog.canEat("Tommy");
    }

}

class Animal {

    String name;

    public void canEat(String name) {
        this.name = name;
        System.out.println("Animals can eat");
    }

}

class Dog extends Animal {
    @Override
    public void canEat(String name) {
        this.name = name;
        System.out.println(name + " Can eat");
    }

}