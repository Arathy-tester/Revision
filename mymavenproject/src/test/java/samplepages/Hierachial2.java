package samplepages;
class Puppy2 extends Dog_hierarchial
{
	void play()
	{
		System.out.println("Second Puppy");	
	}
	
}
public class Hierachial2 {

	public static void main(String[] args) {
		Puppy2 p= new Puppy2();
		p.eat();//Parent Class
		p.play();//Child Class

	}

}
