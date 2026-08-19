#include <stdio.h>
void main()
{
    int i=0,j=1,k=2,m;
    m=  j-- || i++ && --k;
    printf ("%d %d %d %d",m,i,j,k);
}