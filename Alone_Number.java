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
     int i=0;
     int ans = 0;
      for( i=0;i<a;i++)
      {
         int b = scn.nextInt();
         ans = ans^b;
      }
      System.out.println(ans);
    }
  }
}
