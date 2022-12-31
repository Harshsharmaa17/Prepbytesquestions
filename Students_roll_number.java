import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while(t-->0)
    {
      int a = scn.nextInt();
      int sum =0;
      int[] arr = new int[a];
      for(int i=0;i<a;i++)
      {
      arr[i] = scn.nextInt();
      if(i%2 ==  0){
          sum = arr[i];
      
      System.out.print(sum + " ");
      }
      
    }System.out.println();}
  }
}
