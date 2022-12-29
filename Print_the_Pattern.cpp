#include <bits/stdc++.h>
  using namespace std;
  void pattern(int a)
  {
    cout << a << " ";
    if(a<=0)
    return;
    
   pattern(a-5);
    cout << a << " ";
    
  }
  int main()
  {
    int t;
    cin>> t;
    while(t-->0)
    {
      int a;
      cin >> a;
      pattern(a);
      cout <<endl;
    }
    return 0;
  }
