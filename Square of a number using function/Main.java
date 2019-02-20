import java.util.Scanner;
class Main
{
  public static int Squared_number(int num)
  {
    int Ans = num * num;
    return Ans;
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sq = Squared_number(n);
      System.out.print(sq);
                      
	} 
}