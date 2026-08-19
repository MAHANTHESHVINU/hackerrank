#include <stdio.h>
void main()
{
    int a=2,b=4;
    a=++a + ++a + --b - --b* a--%--a;
    b=a++|a>b&&1;
    printf("a=%d b=%d",a,b);
}