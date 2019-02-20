import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k =1;
    for(k = 1; k <= n; k++)
    {
      System.out.print(k);
      if(k % 3 == 0)
        System.out.print(",");
  }
  }
}