import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while(t-->0)
    {
      int count=0;
      int a = scn.nextInt();
      while(a >= 1000)
      {
        a-=1000;
        count++;
      }
      while(a >= 500)
      {
        a-=500;
        count++;
      }
      while(a >= 100)
      {
        a-=100;
        count++;
      }
      while(a >= 50)
      {
        a-=50;
        count++;
      }
      while(a >= 20)
      {
        a-=20;
        count++;
      }
      while(a >= 10)
      {
        a-=10;
        count++;
      }
      while(a >= 5)
      {
        a-=5;
        count++;
      }
      while(a >= 2)
      {
        a-=2;
        count++;
      }
      while(a >= 1)
      {
        a-=1;
        count++;
      }
      System.out.println(count);
      count =0;
    }
  }
}
