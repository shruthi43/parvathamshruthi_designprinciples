package calculator;

import java.util.*;

public class Calculator {
	public static void main(String args[])
	{
	  Scanner in=new Scanner(System.in);
	  System.out.println("select the operation to perform:");
	  System.out.println("1.add,2.subtract,3.multiply,4.divide");
	  int ch=in.nextInt();
	  System.out.println("enter the number to perform operation on:");
	  int a=in.nextInt();
	  int b=in.nextInt();
	  in.close();
	  new Choice(a,b,ch);
	}
}
