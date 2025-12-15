package javarevision;

public class ThisConst {

	public static void main(String[] args) {
		ThisConst obj = new ThisConst();

	}
	public ThisConst()
	{
		this(50);
		System.out.println("Default Constructor");
	}
	public ThisConst(int a)
	{
		this("HELLO");
		System.out.println(a);
	}
	public ThisConst(String a)
	{
		System.out.println(a);
	}
}
