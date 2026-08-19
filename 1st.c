// #include <stdio.h>

// int main(void)
// {
//     int x = 5;

//     int a = ++x;
//     int b = x++;
//     int c = a + b;

//     printf("%d\n", c);
//     return 0;
// }
#include <stdio.h>
#include <math.h>
double main()
{
    int x = 5;
    int c= ++x + x++ * ++x / ++x % ++x;
    printf("%d", c);
    
}