#include <bits/stdc++.h>
using namespace std;
int transitionPoint(int arr[], int n) {
    if(arr[n-1] == 0)
        return -1;
    
    if(n==1)
    {
        if(arr[0] == 1)
            return 0; 
        else
            return -1; 
    }
    int L = 0;
    int R = n-1;
    while(L <= R)
    {
        int mid = floor((L+R) /2);
        if(arr[mid] == 1 && arr[mid-1] != 1)
            return mid;
        else if(arr[mid] == 0)
            L = mid+1;
        else if(arr[mid] == 1)
            R = mid-1;
    }
    return -1;
}
int main()
{
  //write your code here
  int t;
  cin >> t;
  while(t-->0)
  {
    int a;
    cin >> a;
    int arr[a];
    for(int i=0;i<a;i++)
    {
     cin >> arr[i];
    }
    int ans = transitionPoint(arr, a);
    cout << ans << endl;
  }
  return 0;
}
