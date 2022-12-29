#include <bits/stdc++.h>
#include<cstdint>
  using namespace std;
  // here i have using long long so that i can store the value more than 2^32-1
  long long int factorial(long long int a)
  {
    if(a<1)
    {
      return 1;
    }
    else
    return a * factorial(a-1);
  }
  int main()
  {
    int t;
    cin >> t;
    while(t-->0){
    long long int a;
    cin >>a;
    long long int ans = factorial(a);
    cout << ans << endl;
    }
    return 0;
  }
