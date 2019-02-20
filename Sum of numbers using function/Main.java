import java.util.Scanner;
class Main{
public static int Sum_First(int num)
{
  int sum = (num * (num + 1))/2;
  return sum;
}
  public static void main (String[] args){
	    // Type your code here
	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = Sum_First(n);
    System.out.print(k);
  }
}
