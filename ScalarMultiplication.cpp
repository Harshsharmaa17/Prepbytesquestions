#include <bits/stdc++.h>
  using namespace std;
  
  int main()
  {
  int rows;
  int cols;
  int scalar;
  int product;
  int a[100][100];

  cin >> rows >> cols >> scalar;
  for(int i=0;i<rows;i++)
  {
    for(int j=0;j<cols;j++)
    {
    cin >> a[i][j];
  }
  }
  for(int i=0;i<rows;i++)
  {
    for(int j=0;j<cols;j++)
    {
      product = scalar*a[i][j];
      cout << product << " ";
    }
    cout << endl;
  }
  return 0;
  }
