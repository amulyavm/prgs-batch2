package firstProject2;

public class First {

	public static void main(String[] args) {
		System.out.println("this is main start");
		int a=10; 
		int b=5;
		int c = a/b;
		System.out.println("division is "+ c);
		System.out.println("this is multiplaction ");
		multi();
		System.out.println("this is end of multi method");
		add();
		System.out.println("this is end");
		
	}
	
	public static void multi() {
		System.out.println("this is multi ");
		int x=21;
		int y=40;
		int z = x*y; 
	System.out.println("multiplication is " + z);
	System.out.println("end of multi");	
		// TODO}
	
	
	}
	public static void add() {
		System.  out. println("this is start of addition");
		int d=21;
		int e= 31;
		int f=d+e;
		System.out.println("addition is "+ f);
		System.out.println("this is the end of addition");
		
	}

}
