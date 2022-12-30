import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner scn = new Scanner(System.in);
    int t= scn.nextInt();
    while(t-->0)
    {
      int a = scn.nextInt();
      int b = scn.nextInt();
   
    if( a == b)
    {
      int c = a+b;
      System.out.println(c);
    }
    else if(a > b)
    {
      int d = a + a-1;
      System.out.println(d); }
 
    if(b > a)
    {
      int f = b +b-1;
      System.out.println(f);   }
    }
  }
}
