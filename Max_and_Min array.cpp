#include <bits/stdc++.h>
using namespace std;
int getmin( int arr[], int size)
{
  int mini = INT_MAX;
  for(int i=0;i<size;i++)
  {
    mini = min(mini,arr[i]);
  }
  return mini;
}
int getmax(int arr[],int size)
{
 int maxi = INT_MIN;
  for(int i=0;i<size;i++)
  {
     maxi = max(maxi,arr[i]);
  }
  return maxi;
}
int main()
{
  //write your code here
  int t;
  cin >> t;
  while(t-->0) {
 int size;
  cin >> size;
  int arr[size];
  for(int i=0;i<size;i++)
  {
    cin >> arr[i];
  }
  cout << getmin(arr,size) << " " << getmax(arr,size) << endl;
  }
  return 0;
}
