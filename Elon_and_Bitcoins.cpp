#include <bits/stdc++.h>
using namespace std;

int main()
{
  //write your code here
  int a;
  int temp =0;
  cin >> a;
  int count=0;
  if(a==a)
  {
    count++;
  
  if(a%2==0)
  {
    count++;
  }

for(int i=3;i<a;i++)
{
  if(a%i==0){
    count++;
  }
}
  cout << count << endl;
  
  }
  return 0;
}
