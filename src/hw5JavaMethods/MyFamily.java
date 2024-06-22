package hw5JavaMethods;


// Implement a return type method which is int type which name could be same as class name. Please follow naming convention for methods. The outcome should be: "The sum of my childrens age is: " + <sum>
public class MyFamily {
public int child1Age = 15;
public int child2Age = 20;
public int child3Age = 25;
public int child4Age = 30;
int sum = child1Age+ child2Age+child3Age+child4Age;
public int myFamily(){
	System.out.println("The sum of my childrens age is: " + sum);
	return 0;
		
}
public static void main(String[] args) {
	MyFamily mf = new MyFamily();
	mf.myFamily();
	
}


}
