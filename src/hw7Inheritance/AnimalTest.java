package hw7Inheritance;
public class AnimalTest {
public static void main(String[] args) {
	System.out.println("\n---------------");
	Animal animal = new Animal();
	animal.animalInfo();
	//Single inheritance
	System.out.println("\n---------------");
	Birds birds = new Birds();
	birds.birdsInfo();
	birds.animalInfo();
	//multilevel inheritance
	System.out.println("\n---------------");
	BullDog bullDog = new BullDog();
	bullDog.bullDogInfo();
	bullDog.dogInfo();
	bullDog.animalInfo();
	bullDog.mammalInfo();
	
	//Hierarchical inheritance
	System.out.println("\n---------------");
	Cobra cobra = new Cobra();
	cobra.cobraInfo();
	cobra.animalInfo();
	cobra.reptileInfo();
	cobra.snakeInfo();
	
	System.out.println("\n---------------");
	Dog dog = new Dog();
	dog.dogInfo();
	dog.animalInfo();
	dog.mammalInfo();
	
	System.out.println("\n---------------");
	Mammal mammal = new Mammal();
	mammal.mammalInfo();
	mammal.animalInfo();
		
	System.out.println("\n---------------");
	Reptile reptile = new Reptile();
	reptile.reptileInfo();
	reptile.animalInfo();
	
	System.out.println("\n---------------");
	Robin robin = new Robin();
	robin.robinInfo();
	robin.animalInfo();
	robin.birdsInfo();
	//Animal is a parent class and Snake is a child class
	System.out.println("\n---------------");
	Snake snake = new Snake();
	snake.snakeInfo();
	snake.animalInfo();
}
}
