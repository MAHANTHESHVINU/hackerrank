#include <stdio.h>

int main()
{
    int n;

    printf("Enter number of rows: ");
    scanf("%d", &n);

    // Upper half
    for (int i = 1; i <= n; i++)
    {
        // Left stars
        for (int j = 1; j <= i; j++)
        {
            printf("*");
        }

        // Middle spaces
        for (int j = 1; j <= 2 * (n - i); j++)
        {
            printf(" ");
        }

        // Right stars
        for (int j = 1; j <= i; j++)
        {
            printf("*");
        }

        printf("\n");
    }

    // Lower half
    for (int i = n - 1; i >= 1; i--)
    {
        // Left stars
        for (int j = 1; j <= i; j++)
        {
            printf("*");
        }

        // Middle spaces
        for (int j = 1; j <= 2 * (n - i); j++)
        {
            printf(" ");
        }

        // Right stars
        for (int j = 1; j <= i; j++)
        {
            printf("*");
        }

        printf("\n");
    }

    return 0;
}