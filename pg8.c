#include <stdio.h>
void main()
{
    int i=0,j=1,k=2,m;
    m=  j-- && i++|| j-- && --k|| ++j && --k;
    //one side is true so it will not check the other side
    printf ("%d %d %d %d",m,i,j,k);
}