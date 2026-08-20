#include <stdio.h>
#include <string.h>

int main()
{
    char a[] = "01:43";

    int n = strlen(a);
    int i, hr, min;
    int hr1, hr2, min1, min2;

    // Check length and :
    if (n != 5 || a[2] != ':')
    {
        printf("Invalid input");
        return 0;
    }

    // Check digits
    for (i = 0; i < n; i++)
    {
        if (i == 2)
            continue;

        if (!(a[i] >= '0' && a[i] <= '9'))
        {
            printf("Invalid input");
            return 0;
        }
    }

    // Convert characters to integers
    hr1 = a[0] - '0';
    hr2 = a[1] - '0';

    min1 = a[3] - '0';
    min2 = a[4] - '0';

    // Get actual hour and minute
    hr = hr1 * 10 + hr2;
    min = min1 * 10 + min2;

    // Validate time
    if (hr > 23 || min > 59)
    {
        printf("Invalid time");
        return 0;
    }

    // Print binary
    for (i = 3; i >= 0; i--)
        printf("%d", (hr1 >> i) & 1);

    printf(" ");

    for (i = 3; i >= 0; i--)
        printf("%d", (hr2 >> i) & 1);

    printf(" : ");

    for (i = 3; i >= 0; i--)
        printf("%d", (min1 >> i) & 1);

    printf(" ");

    for (i = 3; i >= 0; i--)
        printf("%d", (min2 >> i) & 1);

    return 0;
}