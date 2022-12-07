import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
   Scanner scn = new Scanner(System.in);
   int t = scn.nextInt();
   while(t-->0){
     int count =0;
     int a = scn.nextInt();
     if(a%10 == 0){
       System.out.println(count);
     }
     else if(a%10 !=0)
    {
        int temp = a*2;
        if(temp %10 ==0)
        {
          count++;
          System.out.println(count);
        }
        else {
            count--;
            System.out.println(count);
        }
      }
     }
   }
   }
