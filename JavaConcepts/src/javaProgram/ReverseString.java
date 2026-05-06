package javaProgram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Allah Is Great";
		String reverseString=" ";
		String[] words= str.split(" ");
		for (int i=0; i<=words.length-1;i++) {
			String word=words[i];
			String reverseWord=" ";
			for(int j=word.length()-1;j>=0; j--) {
				reverseWord =reverseWord+word.charAt(j);
				//System.out.print(reverseWord);
				
			}
			reverseString=reverseString+reverseWord;
					
			
		}
		System.out.print(reverseString.trim());
			
		
		
		
	/*	String str= "Allah is great";
		String[] words=str.split(" ");
		for(int i=words.length-1; i>=0; i--) {
			System.out.print(words[i]+" ");
		}*/
		
/*String str= "Allah is Great";
String[] words= str.split(" ");
for(int i=0; i<=words.length-1;i++) {
		String word= words[i];
	int wordLen=word.length();
		String reverseWord="";
		String reverseString=" ";
	for(int j=wordLen-1; j>=0; j--) {
		reverseWord=reverseWord+word.charAt(j);
		//System.out.print(reverseWord);
	}
	reverseString=reverseString+reverseWord;
	System.out.print(reverseString);
}*/

/*String[] words= str.split(" ");
for(int i=words.length-1; i>=0; i--) {
	System.err.print(words[i]+" ");
}*/



/*char[] ch= str.toCharArray();
for(int i=ch.length-1; i>=0; i--) {
	System.out.print(ch[i]);
}*/


/*StringBuffer sbr= new StringBuffer("Allah is great");
System.out.println(sbr.reverse());*/


/*for(int i=str.length()-1; i>=0; i--) {
	System.out.print(str.charAt(i));
}*/
	}

}
