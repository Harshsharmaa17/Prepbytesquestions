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
      int[] arry = new int[a];
      for(int i=0;i<a;i++)
      {
        arry[i] = scn.nextInt();
      }
      Arrays.sort(arry);
      for(int i=0;i<a;i++)
      {
        System.out.print(arry[i] + " ");
      }
      System.out.println();
    }
  }
}
