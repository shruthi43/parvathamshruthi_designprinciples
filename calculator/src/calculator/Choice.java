package calculator;
public class Choice {
	Choice(int a,int b,int ch)
	{
		Operations ob=new Operations(a,b);
	switch(ch)
	  {
	  case 1:System.out.println(ob.add());
	         break;
	  case 2:System.out.println(ob.subtract());
	         break;
	  case 3:System.out.println(ob.multiply());
	         break;
	  case 4:System.out.println(ob.divide());
	         break;
	  default:System.out.println("invalid option");
	         break;
	  }
	}
}
