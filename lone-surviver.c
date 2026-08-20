#include <stdio.h>
#include <string.h>
#include <math.h>
int main()
{
    int n,k,i;
    scanf("%d%d",&n,&k);
    int res=0;
    for(i=0;i<n;i++)
    {
        res=(res+k)%n;
    }
    printf("%d",res+1);
}