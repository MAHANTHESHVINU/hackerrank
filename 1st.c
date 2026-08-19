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
// #include <stdio.h>
// #include <math.h>
// double main()
// {
//     int x = 5;
//     int c= ++x + x++ * ++x / ++x % ++x;
//     printf("%d", c);
    
// }
// #include <stdio.h>
// void main()
// {
//     int a=2, b=4;
//     a= ++a + ++a + --b - --b * a-- % --a;
//     b= a++| a> b && 1;
//     printf("a=%d, b =%d",a,b);
// }
#include <stdio.h>
void main()
{
    int i=0, j=1, k=2, m;
    m= j-- && i++ || j-- && --k || ++j && --k;

    printf ("%d %d %d %d", i, j, k, m);
}