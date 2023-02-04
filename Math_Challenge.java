import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    int diff = Integer.MAX_VALUE;
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int[] arry = new int[a];
    int ans =0;
    for(int i=0;i<a;i++)
    {
      arry[i] = scn.nextInt();
    }
    Arrays.sort(arry);
    for(int i=0;i<a-1;i++) {
      for(int j=i+1;j<a;j++)
      {
        if(Math.abs((arry[i] - arry[j])) < diff)
      
      // ans = Math.abs(arry[i] + ans);
      // ans = Math.abs(arry[i-1] - arry[i]);  
      diff = Math.abs((arry[i] - arry[j] ));
    }
    }
    System.out.println(diff + " ");
  }
}
