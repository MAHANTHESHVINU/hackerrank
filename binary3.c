#include<stdio.h>
#include<string.h>
#include<math.h>

int main()
    {

    char a[]="0000010000100000";
    int n=strlen(a),i,x=0,hr1=0,hr2=0,hr,min,min1=0,min2=0;
    if(n!=16)
    {
        printf("invalid input");
        return 0;
    }
    for(i=0;i<n;i++)
    {
        if(!(a[i]>='0'&&a[i]<='1'))
        {
            printf("invalid input 1");
            return 0;
        }
    }
    for(i=3;i>=0;i--)
    {
        hr1=hr1+pow(2,x++)*(a[i]-48);
    }x=0;
    for(i=7;i>=4;i--)
    {
        hr2=hr2+pow(2,x++)*(a[i]-48);
    }x=0;
    for(i=11;i>=8;i--)
    {
        min1=min1+pow(2,x++)*(a[i]-48);
    }x=0;
    for(i=15;i>=12;i--)
    {
        min2=min2+pow(2,x++)*(a[i]-48);
    }
    hr=hr1*10+hr2;
    min=min1*10+min2;
    if(hr>23||min>59)
    {
        printf("Invalid input3");
    }
    else printf("%02d : %02d",hr,min);
    }