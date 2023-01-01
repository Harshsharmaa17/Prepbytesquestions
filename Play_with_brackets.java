import java.util.*;
import java.io.*;

public class Main { 
    static boolean Brackets(String str)
    {
        Deque<Character> stack
            = new ArrayDeque<Character>();
        for (int i = 0; i < str.length(); i++) 
        {
            char x = str.charAt(i);
            if (x == '(' || x == '[' || x == '{') 
            {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
  
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
  
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
        return (stack.isEmpty());
    }
  
    public static void main(String[] args)
    {
     Scanner scn = new Scanner(System.in);
     int t= scn.nextInt();
     while(t-->0)
     {
      String str = scn.next();
    
        if (Brackets(str))
            System.out.println("Valid");
        else
            System.out.println("Not Valid");
    }
}
}
