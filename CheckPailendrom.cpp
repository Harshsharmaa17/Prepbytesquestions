import java.util.*;
import java.io.*;

public class Main {
  static int pailendrome(int a, int b)
  {
    if(a==0)
    return b;
    b = (b*10) + (a%10);
    return pailendrome(a/10, b);
    
  }
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while(t-->0)
    {
      int a = scn.nextInt();
      int b = pailendrome(a,0);
      if(a == b)
      {
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
  }
}
