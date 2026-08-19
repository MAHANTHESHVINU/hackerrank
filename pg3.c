#include <stdio.h>
#include <math.h>

double main()
{
    int x=5;
    int c= x++ - ++x * x++ % ++x + --x * x-- / --x - x--;
    printf("%d",c);
}
