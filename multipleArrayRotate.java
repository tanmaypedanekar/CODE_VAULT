import java.util.*;
import java.lang.*;
import java.io.*;

class multipleArrayRotate
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your test case :");
		int cases = input.nextInt();
		while(cases>0){
		    System.out.print("Enter your array length :");
		    int num = input.nextInt();
		    int []array = new int [num];
		    for(int i=0;i<num;i++){
		         System.out.print("Enter your "+ (i+1)+ " element : ");
		      array[i]= input.nextInt();
		    }
		    
		    int start=0;
		    int end =array.length-1;
		    while(start<end){
		        int temp=array[start];
		        array[start]=array[end];
		        array [end]=temp;
		        start++;
		        end--;
		    }
		      System.out.println("Your returned array is : ");
		    for(int i=0;i<array.length;i++){
		        System.out.print(array[i]+" ");
		    }
		    System.out.println();
		
		    cases--;
		}
      input.close();
	}
}
