package jot.switc;

public class SwitchExample {

	public static void main(String[] args) {
		Animal[] animals =  {null};

		for (Animal animal : animals ) {
			switch (animal) {
				case Donkey(String name,int age) -> System.out.println("Donkey " + name + " is " + age + " years old.");
				case Monkey(String name,String sex) -> System.out.println("Donkey " + name + " is " + sex + ".");
				case Mouse(String name,int noOfKids) -> System.out.println("Mouse " + name + " has " + noOfKids + " little mice.");
				case null -> System.out.println("animal is null");
			}	
		}
	}
}

sealed interface Animal permits Donkey, Monkey, Mouse {};
record Donkey(String name, int age) implements Animal {};
record Monkey(String name, String sex) implements Animal {};
record Mouse(String name, int noOfKids) implements Animal {};
