import java.util.Scanner;
class Main{
  public static int Power_of_number(int base, int exponent)
  {
    int power = 1;
  while( exponent >= 1)
  {
    power = power * base;
    exponent--;
  }
  return power;   
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int b = in.nextInt();
      int e = in.nextInt();
   int p= Power_of_number(b,e);
      System.out.print(p);
      
    }
	
}