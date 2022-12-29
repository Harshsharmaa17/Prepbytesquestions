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
    cin >>a;
    int ans = a/2;
    if(a%2==0)
    {
        cout << ans << " " << ans << endl;
    }
    else if(a%2 != 0)
    {
        int c = a-ans;
        cout << ans << " " << c << endl;
    }
  }
  return 0;
}
