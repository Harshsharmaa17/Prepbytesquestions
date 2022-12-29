#include <bits/stdc++.h>
  using namespace std;
  
  int main()
  {
    int t;
    cin >> t;
    while(t-->0){
      int count = 0;
      int num;
      cin >> num;
      while(num>0){
      int temp = num%10;
      num = num/10;
      if(temp == 5){
        count++;
    } 
    cout << count << endl;
    }
    return 0;
  }
