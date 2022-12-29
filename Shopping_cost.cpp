#include <bits/stdc++.h>
  using namespace std;
  
  int main()
  {
     int t;
    cin>>t;
    while(t-->0){
      float  a;
      float  b;
      cin >> a;
      cin >> b;
      double answer = a*b;
      if(a>100)
      {
      float answer_one = a*b*0.2;
      float newans= a*b-answer_one;
      cout <<fixed<<setprecision(1)<< newans << endl;
    }
    else
    cout <<fixed<< setprecision(1) <<answer << endl;
    }
    return 0;
  }
