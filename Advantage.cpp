#include <bits/stdc++.h>
using namespace std;

int main()
{
  //write your code here
  int a, b;
  cin >> a >> b;
  int k;
  cin >> k;
  int count=0;
  for(int i=a;i<=b;i++)
  {
    if(i%k==0)
    {
      count++;
    }
    
  }cout << count <<endl;
  return 0;
}
