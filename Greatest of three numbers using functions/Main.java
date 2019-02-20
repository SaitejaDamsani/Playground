import java.util.Scanner;
class Main{
  public static int Greatest(int n1, int n2, int n3) {
  int gr;
    if(n1 > n2)
   { 
     if(n1 > n3)
       gr = n1;
     else
       gr = n3;
   }
   else if(n2 > n3)
      gr = n2;
    else 
      gr = n3;
    return gr;
  }
	public static void main (String[] args) 
    {
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      int num3 = in.nextInt();
      int g = Greatest(num1,num2,num3);
      System.out.print(g);
	}
}