#include <bits/stdc++.h>
using namespace std;

int main()
{
  //write your code here
  int n;
  cin >> n;
  if(n>8)
  {
    int f = 4;
    cout << f << endl;
  }
   else if(n%2 != 0)
  {
  int d = n/2;
  d++;
  cout << d << endl;
  }
  else if(n%2 == 0)
  {
    int d = n/2;
    cout << d << endl;
  }
  
 
  return 0;
}
