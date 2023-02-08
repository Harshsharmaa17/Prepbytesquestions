// this is one of the most easy approach for this question
import java.util.*;
import java.io.*;

public class Main {
 public static int transitionPoint(int arr[], int n) {
  for(int i=0;i<n;i++)
    if(arr[i] == 1)
      return i;
  return -1;
}
  public static void main(String args[]) throws IOException {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while(t-->0)
    {
      int a = scn.nextInt();
      int[] arr = new int[a];
      for(int i=0;i<a;i++)
      {
        arr[i] = scn.nextInt();
      }
      int ans = transitionPoint(arr, a);
      System.out.println(ans);
    }
    //write your code here
    
  }
}
