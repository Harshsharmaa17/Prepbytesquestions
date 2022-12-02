#include<iostream>
using namespace std;
//function for multiplication
int multiply(int arr[], int len) {
   int i,temp=1;
   for(i=0;i<len;i++) {
      temp= temp * arr[i];
   }
   return temp;
}
int main() {
  int t;
  cin >> t;
  while(t-->0){
    int size;
    cin >> size;
   int arr[size];
   
   for(int i=0;i<size;i++)
   {
   cin>>arr[i];
   }
   int len=sizeof(arr)/sizeof(arr[0]);
   int value = multiply(arr,len);
   cout << value << endl;
  }
   return 0;
}
