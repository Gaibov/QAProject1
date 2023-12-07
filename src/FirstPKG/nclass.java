package FirstPKG;

public class nclass {
	  int x = 5;

	  public static void main(String[] args) {
	    nclass myObj1 = new nclass();  // Object 1
	    nclass myObj2 = new nclass();  // Object 2
	    System.out.println(myObj1.x);
	    System.out.println(myObj2.x);
	  }
	}
	 
	 



class Vehicle {
	  protected String brand = "Ford";        // Vehicle attribute
	  public void honk() {                    // Vehicle method
	    System.out.println("Tuut, tuut!");
	  }
	}