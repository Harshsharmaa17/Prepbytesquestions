/// this code is passing only 4 test cases out of 14 


import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner scn = new Scanner(System.in);
    int  a = scn.nextInt();
    int[] nums = new int[a];
    int  b = scn.nextInt();
    int ans =0;
    int i=0;
    for(i=0;i<a;i++)
    {
      nums[i] = scn.nextInt();
    }
     Arrays.sort(nums);

  for(i=i-b ;i<a;i++)
  {
    ans = ans + nums[i];
    
  }
  System.out.println(ans);
}  
}
