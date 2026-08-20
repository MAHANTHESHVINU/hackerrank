#include <stdio.h>

int binaryToDecimal(long long binary)
{
    int decimal = 0;
    int place = 1;
    int digit;

    while (binary > 0)
    {
        digit = binary % 10;
        decimal = decimal + digit * place;
        place = place * 2;
        binary = binary / 10;
    }

    return decimal;
}

int main()
{
    long long h, m, s;

    printf("Enter binary time (HH MM SS): ");
    scanf("%lld %lld %lld", &h, &m, &s);

    printf("Time = %02d:%02d:%02d\n",
           binaryToDecimal(h),
           binaryToDecimal(m),
           binaryToDecimal(s));

    return 0;
}