package jot;

public class PatternMatchingExamples {
	public static void main(String[] args) {
		Zoo zoo = new Zoo(new Monkey("Jake", 5), new Donkey("Bob", 3));
		
		System.out.println("Old Code :");
		
		animalAgeOld(zoo);
		
		System.out.println("With new pattern matching :");
		
		animalAge(zoo);		
	}
	
	/**
	 * Version with new pattern matching feature
	 */
	public static void animalAge(Object o) {
		if (o instanceof Zoo (Monkey(String mName,int mAge) m, Donkey(String dName,int dAge) d )) {
			System.out.println(mName + " the monkey is "+ mAge + " years old." );
			System.out.println(dName + " the donkey is "+ dAge + " years old." );
		}
	}
	
	/**
	 * Version without the new pattern matching feature
	 */
	public static void animalAgeOld(Object o) {
		if (o instanceof Zoo z ) {
			String mName = z.monkey().name();
			String dName = z.donkey().name();
			int mAge = z.monkey().age();
			int dAge = z.donkey().age();
			
			System.out.println(mName + " the monkey is "+ mAge + " years old." );
			System.out.println(dName + " the donkey is "+ dAge + " years old." );
		}
	}
}

record Monkey(String name, int age) {};
record Donkey(String name, int age) {};
record Zoo(Monkey monkey, Donkey donkey){};


