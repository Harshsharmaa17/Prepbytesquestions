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
      int count =0;
      for(int i=1;i<=a;i=i+2)
      {
        int k = a-i+1;
        count += (k*k);
      }
      System.out.println(count);
    }
  }
}
