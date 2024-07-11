package hw14Abstraction;

public interface University extends College, Hospital {
public void classSize();
public void playGround();
public void teacher(); 
// No inside the interface you can't create a constructor 
//public University() {}
	

}
