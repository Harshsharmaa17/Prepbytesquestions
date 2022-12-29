#include <bits/stdc++.h>
  using namespace std;
  int sum(int a)
  {
    if(a==0){
    return 0;
    }
    return ((a%10) + sum(a/10));
    
  }
  int main()
  {
    int t;
    cin >> t;
    while(t-->0)
    {
      int a;
      cin >> a;
      int ans = sum(a);
      cout << ans << endl;
    }
    return 0;
  }
