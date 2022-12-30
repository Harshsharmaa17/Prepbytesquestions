import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner scn = new Scanner(System.in);
    int t= scn.nextInt();
    while(t-->0){
      int a = scn.nextInt();
      int b = scn.nextInt();
      int c = scn.nextInt();
      if( a+b <= c) {
        int ans1 = 2;
        System.out.println(ans1);
      }
      else if( a+b > c && a <= c){
        int ans2 = 1;
        System.out.println(ans2);
      }
      else if(a > c) {
        int ans3 = 0;
        System.out.println(ans3);
      }
    }
  }
}
