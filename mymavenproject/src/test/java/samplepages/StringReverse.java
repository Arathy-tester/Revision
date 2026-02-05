package samplepages;

public class StringReverse {

	public static void main(String[] args) {
		String str="Hello World";
		char chars[]= str.toCharArray();
		String reversed=" ";

		for(int i=chars.length-1;i>=0;i--)
		{
			reversed=reversed + chars[i];
		}
		System.out.println("Reversed: " + reversed);
	}
	

}
