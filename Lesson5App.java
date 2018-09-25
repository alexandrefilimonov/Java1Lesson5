package ru.geekbrains.Lesson1;

public class Lesson5App{
    public static void main( String [] args ) {
		int qty= 5;
        Person [] personArray = new Person[qty];
        personArray[0] = new Person("Ivan Ivanov", "Programmer", "ivanivanov@gm.com","8123452323","30000","30");
		personArray[1] = new Person("Petr Petrov", "Technician", "petrpetrov@gm.com","81288872323","27000","35");
		personArray[2] = new Person("Semen Kurt", "Programmer", "semenkurt@gm.com","8123453323","50000","42");
		personArray[3] = new Person("Alla Boykaya", "Engineer", "allaboykaya@gm.com","8127845323","60000","47");
		personArray[4] = new Person("Sofia Bozenkina", "Secretary", "sofiabozenkina@gm.com","8129952323","35000","22");
		
		System.out.println("\nWorkers older than 40 years old:");
		for (int i=0; i<qty; i++) {
			if (Integer.parseInt(personArray[i]._age)>40) personArray[i].display();
		}
    }
}
