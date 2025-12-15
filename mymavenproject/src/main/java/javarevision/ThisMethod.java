package javarevision;

public class ThisMethod {

	public static void main(String[] args) {
		ThisMethod obj=new ThisMethod();
		obj.display();
	}
	public void display()
	{
		this.show();
		System.out.println("second one");
	}
	public void show()
	{
		System.out.println(("First One"));
	}
}
