package samplepages;

public class Child_superM extends Parent_superM  {

	void show() {
        System.out.println("Child class show method");
        super.show();   // calling parent method
    }

    public static void main(String[] args) {
    	Child_superM obj = new Child_superM();
        obj.show();
    }

}
