import java.util.*;
import java.io.*;

public class Main {
   static int countAmanSubstrings(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String substr = str.substring(i, j);
                if (substr.contains("aman")) {
                    count++;
                }
            }
        }
        return count;
    }
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String str = scanner.next();
            int ans = countAmanSubstrings(str);
            System.out.println(ans);
        }
    }
  
}
