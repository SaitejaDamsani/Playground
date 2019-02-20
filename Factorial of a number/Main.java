import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int n = 1;
      int fac = 1;
      if(num == 0)
        System.out.print("1");
      else
      {
        for(n = 1; n <= num; n++)
        {
        fac = fac * n;
          }
      System.out.print(fac);
      }
	}
}