// Example of variable - Static, Local and Instance
class Test1810223 {
	static int x=100; //static declare variable
	 void m()// method declare
	{
		int l=75; // Local variable
		System.out.println(l);
	}
public static void main(String[] args) {
	Test obj=new Test(); // object creation 
	int y=200; // Instance variable
	System.out.println(x);
	System.out.println(y);
	obj.m();
	 }//main end
}//clas end