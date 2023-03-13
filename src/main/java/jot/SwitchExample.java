package jot;

public class SwitchExample {

    public static void main(String[] args) {
        Pair<Animal> p1 = new Pair<Animal>(new Animal(), new Animal());

        switch (p1) {
            case Pair<Animal>(Donkey a, Donkey b) -> System.out.println("Two Donkeys");
            case Pair<Animal>(Animal a, Donkey b) -> System.out.println("Animal and Donkey");
            case Pair<Animal>(Donkey b, Animal a) -> System.out.println("Donkey and Animal");
            case Pair<Animal>(Animal b, Animal a) -> System.out.println("Two Animals");
            case default ->  System.out.println("No animals");
        }
    }    
}

record Pair<T>(T x, T y) {}

class Animal {}
class Donkey extends Animal {}



