#include <bits/stdc++.h>
using namespace std;

int main()
{
  //write your code here
  int t;
  cin >> t;
  while(t-->0)
  {
    int a;
    int sum =0 ;
    int temp =0;
    cin >> a;
    int arr[a];
    for(int i=0;i<a;i++)
    {
      cin >> arr[i];
      if(arr[i] >10)
      {
       if(arr[i]%2 !=0)
       {
         sum = sum+arr[i];
       }
       else
       {
         sum = sum + arr[i]/2;
       }
      }
     
    } 
    cout << sum << endl;
  }
  return 0;
}
