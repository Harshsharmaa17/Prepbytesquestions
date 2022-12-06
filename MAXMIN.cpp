#include <bits/stdc++.h>
  using namespace std;
  
  int main()
  {
    int t;
    cin >> t;
    while(t-->0)
    {
      int i,a,b;
      int lengthofArray;
      cin >> lengthofArray;
      int arr[100000000];
      for(i=0;i<lengthofArray;i++)
      {
        cin >> arr[i];
      }
       a = arr[0];
       b = arr[0];
      for(i=0;i<lengthofArray;i++)
      {
        if(arr[i] > a)
        {
          a = arr[i];
        }
        if(arr[i] < b)
        {
          b = arr[i];
        }
      }
        cout << b << " " << a << endl; 
    }
    return 0;
  }
