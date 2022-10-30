#include <iostream>
using namespace std;
int fact(int n)
{
    if (n==0)
        return 1;
    return fact(n-1)*n;
}
int main()
{
    int r = fact(6);
    cout<<"result is: "<<r;
    return 0;
}
//////////////////////////
