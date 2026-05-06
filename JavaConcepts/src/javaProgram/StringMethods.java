package javaProgram;

public class StringMethods {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str= "Automation is mandatory";
      String str1= "selenium";
      String str2= "selenium";
      String str3= new String("selenium");
      String str4= new String("selenium");
      String str5= str1+str2;
     // int i=10; int j=20;
      
       String trim= "             hjg";
       String empty= "";
       System.out.println(str5);

     System.out.println("lenth= "+ str.length());
     System.out.println("char at= "+ str.charAt(4));
     System.out.println("index of ="+str.indexOf("m"));
     System.out.println("concating= "+str.concat(" "+"for QA"));
     System.out.println("contains= "+str.contains("man"));
     System.out.println("Strats with= "+ str.startsWith("Auto"));
     System.out.println("ends with= "+ str.endsWith("ory"));
     System.out.println("concating using 2 strings= "+str.concat(" "+str1));
     System.out.println("lower case= "+str.toLowerCase());
     System.out.println("upper case= "+str.toUpperCase());
     System.out.println(trim.trim());
     System.out.println(str.lastIndexOf('m'));
     System.out.println(empty.isEmpty());
     System.out.println(str.isEmpty());
     System.out.println(str2.replace('e', 'i'));
     System.out.println(str.substring(4));
     System.out.println(str2.substring(4,7));
     int len=str1.length();
     for(int i= len-1; i>=0; i--) {
    	 System.out.print(str1.charAt(i));
     }
     System.out.println();
     char[] ch= str1.toCharArray();
     for(int j=len-1; j>=0; j--) {
    	 System.out.print(ch[j]);
     }
     
    /* char[] ch= str1.toCharArray();
     for(int i=0; i<ch.length;i++) {
    	System.out.println("char at "+i+" " +ch[i]);
    	 
     }*/
     
     
/*System.out.println(str.equals(str1));//F
System.out.println(str2.equals(str1));//T
System.out.println(str2.equals(str3));//T
System.out.println(str4.equals(str3));//T
System.out.println(str1==str3);//F
System.out.println(str2==str1);//T
System.out.println(str3==str4);//F*/

     
	}

}
