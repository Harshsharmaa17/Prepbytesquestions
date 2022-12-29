#include<iostream>
using namespace std;
int main()
{
  int t;
  cin >> t;
  while(t-->0)
  {
    int zero = 0;
    int num;
    cin >> num;
    if(num % 10 ==0)
    {
      cout << zero << endl;
    }
    else if(num % 10 != 0)
    {
      int temp = num*2;
      if(temp%10 == 0){
        zero++;
        cout << zero << endl;
      }
      else{
      zero--;
      cout << zero << endl;
      }
      
    }
  }
}
