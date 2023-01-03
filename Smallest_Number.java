// there is one problem in this code as it is passing only 2 test cases out of 4

import java.util.*;
import java.io.*;

public class Main {
  static int findDuplicate(int arr[], int a, int b)
  { Arrays.sort(arr);
    int i = 0; 
	while (i < a) 
	{ int j, count = 1; 
	for (j = i + 1; j < a && arr[j] == arr[i]; j++) 
	count++; 
  if (count == b) 
			return arr[i]; 
	i = j; 
	} 
return -1; 
}
 
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int[] arry = new int[a];
    int b = scn.nextInt();
    int i=0;
    for(i=0;i<a;i++)
    {
      arry[i] = scn.nextInt();
    }
   int ans = findDuplicate(arry, a,b);
   System.out.println(ans);
  
} }
