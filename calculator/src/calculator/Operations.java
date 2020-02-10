package calculator;

public class Operations {
		int x,y;
		Operations(int a,int b)
		{
			this.x=a;
			this.y=b;
		}
		public int add()
		{
			return(x+y);
		}
		
		public int subtract()
		{
			return(x-y);
		}
		public int multiply()
		{
			return(x*y);
		}
		public int divide()
		{
			return(x/y);
		}
}
