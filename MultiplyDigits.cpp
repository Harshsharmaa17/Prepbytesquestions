#include <bits/stdc++.h>
using namespace std;
const long long  mod = 1e9 + 7;
int Muldigit(long long  a, long long mod)
{
  if(a==0)
  {
    return 1;
  }
  return ((a%10)%mod*Muldigit(a/10,mod))%mod;
}
int main()
{ 
  //write your code here
  int t;
  cin >> t;
  while(t-->0)
  {
    long long  a;
    cin >> a;
    int ans = Muldigit(a,mod);
    cout << ans << endl;
  }
  return 0;
}
