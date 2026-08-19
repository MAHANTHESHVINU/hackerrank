#include <stdio.h>

int main()
{
    int n;

    printf("Enter number of rows: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
    {
        // Spaces
        for (int j = 1; j <= n - i; j++)
        {
            printf(" ");
        }

        // Stars
        for (int j = 1; j <= n; j++)
        {
            printf("* ");
        }

        printf("\n");
    }

    return 0;
}