#include <bits/stdc++.h>
using namespace std;

int main()
{
  //write your code here
  int t;
  cin >> t;
  while(t-->0)
  {
    int num, originalNum, remainder, n = 0, result = 0, power;
   cin >> num;
   originalNum = num;
   while (originalNum != 0) {
      originalNum /= 10;
      ++n;
   }
   originalNum = num;

   while (originalNum != 0) {
      remainder = originalNum % 10;
      power = round(pow(remainder, n));
      result += power;
      originalNum /= 10;
   }
    if(num == result)
    {
    cout << "YES" << endl;
  }
  else
  {
    cout << "NO" << endl;
  }
  }
  return 0;
}
