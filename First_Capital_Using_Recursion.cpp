#include <bits/stdc++.h>
using namespace std;
int Capital(char s[],int pos)
{ if(s[pos]!='\0')  // here we have checked whether the string contains something or not
  {if(s[pos]>='A'&&s[pos]<='Z') // here we have checked whether the string contains letters of upper cases
    return pos;
  else
    return Capital(s,pos+1); // her we are taking our function to next letter 
}
  return -1;  // this will be returned default if base case and the main case will not pass
}
int main()
{int t;
cin>>t;
while(t-->0)
{char s[10000];
int pos=0;
cin>>s;
int ans=Capital(s,pos);
cout<<ans<< endl;
}return 0;
}
