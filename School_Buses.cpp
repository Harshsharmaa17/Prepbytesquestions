#include <bits/stdc++.h>
using namespace std;

int main()
{
  //write your code here
  int t;
  cin >> t;
  while(t-->0){
    int strength;
    int capacity;
    cin >> strength >> capacity;
    int count =0;
    int c =0;
    if( strength== capacity)
    {
      count++;
      cout << count << endl;
    }
    else if(strength < capacity)
    {
      count++;
      cout << count << endl;
      
    }
    else if( strength%capacity !=0)
    {
      c = strength/capacity;
      c++;
      cout << c<< endl;
    }
    else if(strength%capacity == 0)
    {
      c = strength/capacity;
      cout << c << endl;
    }
  }
  return 0;
}
