#include<iostream>
using namespace std;
int main() {
  int n,count=0;
  cin >> n;
  while(n-->0)
  {
    int t,c,k;
    cin >> t >> c;
    k = c-t;
    if(k>=2)
      count++;
    
  }
  cout << count;
  return 0;
}
