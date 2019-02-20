import java.util.Scanner;
class Main{
public static void Segregate(int size, int arr[]) {
    int zero_size = 0;
    int zero[] = new int[size];
    int pos_size = 0;
    int pos[] = new int[size];
    for(int i=0; i<size; i++) {
      if(arr[i] > 0)
      {
        pos[pos_size] = arr[i];
        pos_size++;
      }
      if(arr[i] == 0)
      {
        zero[zero_size] = arr[i];
        zero_size++;
      }
    }
    int arr_index = 0;
    for(int i=0; i < pos_size; i++) {
      arr[arr_index] = pos[i] ;
      arr_index++;
    }
    for(int i=0; i < zero_size; i++) {
      arr[arr_index] = zero[i];
      arr_index++;
    }
  }
public static void main(String args[]) {
 Scanner in = new Scanner(System.in);
  int size = in.nextInt();
  int arr[] = new int[size];
  for(int i = 0; i < size; i++)  {
    arr[i] = in.nextInt();
  }
  Segregate(size,arr);
    for(int i = 0; i<size; i++)  {
     System.out.print(arr[i]+" ");
  }
}
 
}