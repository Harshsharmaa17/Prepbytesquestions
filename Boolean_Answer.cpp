#include <bits/stdc++.h>
using namespace std;

int main()
{
  //write your code here
  int t;
  cin >> t;
  while(t-->0)
  {
    int rows;
    int cols;
    int count;
    int l =-1;
    int max=0;
    cin >> rows;
    cin >> cols;
    int arr[rows][cols];
    for(int i=0;i<rows;i++)
    { count =0;
      for(int j=0;j<cols;j++)
      {
        cin >> arr[i][j];
        count = count + arr[i][j];
      }
      if(count>max)
      {
        l=i;
        max=count;
      }
    }
    cout << l << endl;
  }
  return 0;
}
