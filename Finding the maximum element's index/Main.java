import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    int max_idx;
    for(int i = 0; i<n; i++) {
      list[i] =in.nextInt();
    }
    if(list[0] > list[1])
      max_idx = 0;
    else
      max_idx = 1;
    for (int idx = 2;idx <=n-1; idx++)
    {
      if(list[max_idx] < list[idx])
        max_idx=idx;
    }
    System.out.print(max_idx);
    
  }
}