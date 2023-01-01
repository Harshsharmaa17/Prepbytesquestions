import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    Scanner scn = new Scanner(System.in);
    int t= scn.nextInt();
    while(t-->0){
      int a = scn.nextInt();
      int[] array = new int[a];
      int[] temp = new int[a];
      
      for(int i=0;i<a;i++)
      {
        array[i] = scn.nextInt();
       
     }
    for(int i=0;i<a;i++)
    {
      temp[i] = array[i];
    }
    Arrays.sort(array);
    int count =0;
    for(int i=0;i<a;i++)
    {
      if(temp[i] != array[i]){
        count++;
      }
      
    }System.out.println(count);
    }
  }
}
