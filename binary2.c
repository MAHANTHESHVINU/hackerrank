#include <stdio.h>
#include <string.h>

int binaryToDecimal(char a[])
{
    int i, decimal = 0;

    for (i = 0; i < 4; i++)
    {
        decimal = decimal * 2 + (a[i] - '0');
    }

    return decimal;
}

int main()
{
    char a[] = "00000001:01000011";

    int n = strlen(a);
    int i;
    int hr1, hr2, min1, min2;
    int hr, min;

    // Check length and :
    if (n != 17 || a[8] != ':')
    {
        printf("Invalid input");
        return 0;
    }

    // Check binary digits
    for (i = 0; i < n; i++)
    {
        if (i == 8)
            continue;

        if (a[i] != '0' && a[i] != '1')
        {
            printf("Invalid binary input");
            return 0;
        }
    }

    // Convert each 4-bit group to decimal
    hr1 = binaryToDecimal(a);
    hr2 = binaryToDecimal(a + 4);

    min1 = binaryToDecimal(a + 9);
    min2 = binaryToDecimal(a + 13);

    // Get actual hour and minute
    hr = hr1 * 10 + hr2;
    min = min1 * 10 + min2;

    // Validate time
    if (hr > 23 || min > 59)
    {
        printf("Invalid time");
        return 0;
    }

    printf("%02d:%02d", hr, min);

    return 0;
}