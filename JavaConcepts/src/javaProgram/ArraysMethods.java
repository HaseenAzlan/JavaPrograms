package javaProgram;

import java.util.Arrays;
//sort, copyof, copyofrange, binarysearch, fill, tostring,equals deeptostring, 
//deepequals, parallelsort and setall

public class ArraysMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {78,50,60,100,10,20,40,5,8};
//Copy
int[] copy= Arrays.copyOf(a, a.length);
System.out.println(Arrays.toString(copy));
int[] copy1= Arrays.copyOf(copy, 3);
System.out.println(Arrays.toString(copy1));
int[] copy2= Arrays.copyOfRange(copy, 1,2);
System.out.println(Arrays.toString(copy2));
int[] b= new int[5];
Arrays.fill(b, 50);
System.out.println(Arrays.toString(b));
Arrays.fill(b, 1,5,100);
System.out.println(Arrays.toString(b));
int[] c= {1,2,3}; int[] d= {3,1,2}; int e[]= {6,7,8};
System.out.println(c==d);
System.out.println(Arrays.equals(c, d));

int[][] mul1= {{1,2,3},{3,4,5}};
int[][] mul2= {{1,2,3},{3,4,5}};
System.out.println(mul1==mul2);
System.out.println(Arrays.deepEquals(mul1, mul2));
System.out.println(Arrays.deepToString(mul1));
//parallelsort
Arrays.parallelSort(a);
System.out.println(Arrays.toString(a));
//setall
int[] arr= new int[5];
		Arrays.setAll(arr, i->i*2);
		System.out.println(Arrays.toString(arr));


 

/*int max=0;
 for (int i=0; i<a.length; i++) {
	 if(a[i]>max) {
		 max=a[i];
	 }
	
 }
 System.out.println(max);*/
/* Arrays.sort(a);
 int search= Arrays.binarySearch(a, 10);
 	 System.out.println(search);
 System.out.println(Arrays.toString(a));*/

/*String[] str= {"Azlan", "Haseena", "Altaf"};
Arrays.sort(str);
System.out.println(Arrays.toString(str));

char[] ch= {'a','Z','A'};
Arrays.sort(ch);
System.out.println(Arrays.toString(ch));*/

}

}
