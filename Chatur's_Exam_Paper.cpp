#include <bits/stdc++.h>
using namespace std;
int idiots(string s)
{
  int size = s.length();
  int count =0;
  for(int i=0;i<size/2;i++)
  
    if(s[i] != s[size-i-1])
    
      count = count + abs(s[i] - s[size-i-1]);
    
  
    return count;

  
}
int main()
{
  //write your code here
  int t;
  cin >> t;
  while(t-->0)
  {
    string s;
    cin >> s;
    int ans = idiots(s);
    cout << ans << endl;
  }
  
  return 0;
}
