package samplepages;

public class LastwordReverse {

	public static void main(String[] args) {
		String sent="I am Learning Java";
		String words[]=sent.split(" ");
		String lastword= words[words.length-1];
		String lastwordReverse=" ";
		for(int i=lastword.length()-1;i>=0;i--)
		{
			lastwordReverse=lastwordReverse+lastword.charAt(i);
		}
		words[words.length-1]=lastwordReverse;
		String results=String.join(" ", words);
		System.out.println("Original:" + sent);
		System.out.println("Reversed:" + results);

	}

}
