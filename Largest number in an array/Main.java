import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int idx=0; idx <= arr_size - 1; idx++)
      {
        arr[idx] = in.nextInt();
      }
      int large = 0;
      for(int idx = 0; idx <= arr_size-1; idx++)
      {
        if( arr[idx] > large)
          large = arr[idx];
      }
      System.out.print(large);
    }
}