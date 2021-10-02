//program to reverse a string in C++

#include <iostream>
using namespace std;
int main()
{
char str[1000], rev[1000];
int i, j, count = 0;
cin >> str;

//finding the length of the string by counting
while (str[count] != '')
{
count++;
}
j = count - 1;

//reversing the string by swapping
for (i = 0; i < count; i++) 
{
rev[i] = str[j];
j--;
}
cout << rev;
}
