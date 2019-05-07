package bankOA;

public class Bank {
	
	double total;
  public void deposite(double a) {

	  System.out.println("Total money available after the depostie is "+ (total + a));
	  total = total + a;
	  
	  
  }
  
  public void withdraw(double b) 
  {
	  total = total - b;
	  
	  System.out.println("Total money available after the withbraw is "+ (total ));
	  
  }
  
public void intrest () {
	double c=0.05;
	double d = total *c;
	total = total +d;
	System.out.println("Total money available after adding the intrest is "+(total));
	
}

}
