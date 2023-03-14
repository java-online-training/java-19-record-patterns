package jot.switc;

public class SwitchExample {

	public static void main(String[] args) {
		Animal[] animals =  {new Donkey("Bob", 5), new Monkey("Jeff", "male"), new Mouse("Mick", 42)};

		for (Animal animal : animals ) {
			switch (animal) {
				case Donkey(String name,int age) -> System.out.println("Donkey " + name + " is " + age + " years old.");
				case Monkey(String name,String sex) -> System.out.println("Donkey " + name + " is " + sex + ".");
				case Mouse(String name,int noOfKids) -> System.out.println("Mouse " + name + " has " + noOfKids + " little mice.");
			}	
		}
	}
}

sealed interface Animal permits Donkey, Monkey, Mouse {};
record Donkey(String name, int age) implements Animal {};
record Monkey(String name, String sex) implements Animal {};
record Mouse(String name, int noOfKids) implements Animal {};
