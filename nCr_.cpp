#include <iostream>
using namespace std;
int fact(int n)
{
    if (n==0)
        return 1;
    return fact(n-1)*n;
}
int nCr(int n, int r)
{
    int a = fact(n)/(fact(r)*fact(n-r));
    return a;
}
int main()
{
    cout<<nCr(7,3);
    return 0;
}