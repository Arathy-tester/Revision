package samplepages;


class Puppy1 extends Dog_hierarchial
	{
		void play()
		{
			System.out.println("First Puppy");	
		}
		
	}
		public class Hierarchial1 {
			public static void main(String[] args) {
				Puppy1 p= new Puppy1();
				p.eat();//Parent class
				p.play();//Child class
	}

}
