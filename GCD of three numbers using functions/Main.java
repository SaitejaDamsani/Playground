import java.util.Scanner;
public class Main{
  public static int GCD(int n1,int n2, int n3)
  {
    int min,gcd1= 0;
    if(n1<n2)
      min = n1;
    else 
      min = n2;
      while(min >= 1)
      {
      if((n1 % min == 0) && (n2 % min == 0))
      { 
        gcd1= min;
        break;
      }
        min--;
       }
     n1 = gcd1;
        n2 = n3;
 return gcd1;
  }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      int num3 = in.nextInt();
      int g = GCD(num1,num2,num3);
      System.out.print(g);
      }
}