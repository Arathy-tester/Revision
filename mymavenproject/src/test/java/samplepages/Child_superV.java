package samplepages;

public class Child_superV extends Parent_superV {
	int x = 20;

    void display() {
        System.out.println("Child x: " + x);
        System.out.println("Parent x: " + super.x);
    }

    public static void main(String[] args) {
    	Child_superV obj = new Child_superV();
        obj.display();
    }

	
}
