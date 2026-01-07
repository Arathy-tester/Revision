package samplepages;

class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}
public class MultiLevelInherience {
		    public static void main(String[] args) {
	        Puppy p = new Puppy();
	        p.eat();   // from Animal
	        p.bark();  // from Dog
	        p.play();  // from Puppy
	    }
	}


