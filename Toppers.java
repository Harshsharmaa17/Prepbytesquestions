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
     int[] arr = new int[1000];
     arr[0] = a;
     arr[1] = b;
     arr[2] = c;
     int f = scn.nextInt();
     
     System.out.print( arr[0] + " " + arr[1] + " " + arr[2] + " ");
     for(int i=3;i<f;i++)
     {
       arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
       System.out.print(arr[i] + " ");
      
     }
      System.out.println();
    }
    }
    }
  
