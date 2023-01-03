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
      int b = scn.nextInt();
      int ans =0;
     
      for(int i=0;i<a;i++)
      {
        arry[i] = scn.nextInt(); 
        if(b==0)
      {
        ans = -1;
      }
        else if(b >= arry[i])
        {
          ans = i;
        }
      }
      System.out.println(ans);
      
      
    }
  }
}
