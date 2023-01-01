import java.util.*;
import java.io.*;

public class Main {
 static String ShortenString(String str1)
{
  Stack<Character> st =
        new Stack<Character>();
  int i = 0;
  while (i < str1.length())
  {
    if (st.isEmpty() ||
        str1.charAt(i) != st.peek())
    {
      st.add(str1.charAt(i));
      i++;
    }
    else
    {
      st.pop();
      i++;
    }
  }
  if (st.isEmpty())
  {
    return ("Empty String");
  }
  else
  {
    String short_String = "";
    while (!st.isEmpty())
    {
      short_String = st.peek() +
                     short_String;
      st.pop();
    }
    return (short_String);
  }
}
 public static void main(String args[]) throws IOException {
    
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while(t-->0)
    {
      String str = scn.next();
      System.out.println(ShortenString(str));
    }
  }
}
