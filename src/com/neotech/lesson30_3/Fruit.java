package com.neotech.lesson30_3;

public class Fruit {
    String color;

    public Fruit(String color) {
        this.color = color;
    }

    public interface Peelable {
        void peel();
    }

    public interface Washable {
        void wash();
    }

    public interface Crackable {
        void crack();
    }
}

class Apple extends Fruit implements Fruit.Peelable, Fruit.Washable {

    public Apple(String color) {
        super(color);
    }

    @Override
    public void peel() {
        System.out.println("Peeling the apple.");
    }

    @Override
    public void wash() {
        System.out.println("Apple is a washable fruit.");
    }
}

class Walnut extends Fruit implements Fruit.Crackable {

    public Walnut(String color) {
        super(color);
    }

    @Override
    public void crack() {
        System.out.println("Cracking the walnut.");
    }
}



// Note1: Interface has ONLY UNIMPLEMENTED methods.

// Note2: They can NOT have constructors.

// Note3: Even tough you do not write abstract, interface will put abstract as deafult.

// Note4: Interface --> %100 abstract --> you can use ONLY unimplement method.

/* Note5: If you want to put every interface inside of the one class, 
			while you are implementing them you should write the class name and then the interface name. 
			--> Fruit implements Fruit.Peelable  */
