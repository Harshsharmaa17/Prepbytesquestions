#include <bits/stdc++.h>
  using namespace std;
  
  int main()
  {
      int sum = 0;
    int a;
    cin >> a;
    while(a>0)
    {
      int digit = a%10;
      sum = sum + digit;
      a=a/10;
    }
  cout << sum << endl;
    return 0;
  }
