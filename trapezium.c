#include <stdio.h>

int main()
{
    int n;

    printf("Enter number of rows: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
    {
        // Leading spaces
        for (int j = 1; j <= n - i; j++)
        {
            printf(" ");
        }

        // Stars and spaces
        for (int j = 1; j <= 2 * i; j++)
        {
            if (i == 1 || i == n || j == 1 || j == 2 * i)
                printf("*");
            else
                printf(" ");
        }

        printf("\n");
    }

    return 0;
}