import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while(t-->0) {
      String str = scn.next();
      int count =0;
      for(int i=0;i<str.length();i++) {
        if(str.charAt(i) == 'a' )
      {
        count++;
      } 
      }      
      if (count  > str.length()/2) 
      {
        System.out.println(str.length());
      }
      else {
        System.out.println((count-1)*2 + 1);
      
      }
      
      
    }
    
  }
}
