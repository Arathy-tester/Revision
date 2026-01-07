package samplepages;

public class Child_superC extends Parent_superC{
	Child_superC() {
        super();   // calls parent constructor
        System.out.println("Child constructor called");
    }

    public static void main(String[] args) {
    	Child_superC obj = new Child_superC();
    }

}
