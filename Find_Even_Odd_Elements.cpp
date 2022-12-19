#include <bits/stdc++.h>
  using namespace std;
  
  int main()
  {
    //write your code here
  int a;
  cin >> a;
  int arr[a];
  int i;
  int temp;
  for( i=0;i<a;i++)
  {
    cin >> arr[i];
    if(arr[i]%2==0)
    {
      cout << arr[i] << " " ;
    }
  }
  cout << endl;
    for(int i=0;i<a;i++)
    {
    if(arr[i]%2!=0)
    {
      cout << arr[i] << " ";
    }
    }
  
    return 0;
  }
