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
      int c = scn.nextInt();
      if(Math.abs(b-a) < Math.abs(c-a))
      {
        System.out.println("B");
      }
      else
      {
        System.out.println("C");
      }
      
    }
  }
}
