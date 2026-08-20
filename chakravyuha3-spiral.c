#include <stdio.h>

int main()
{
    int n, i, j;
    int a[10][10];

    int top = 0, bottom;
    int left = 0, right;
    int k = 0;

    printf("Enter the size of the matrix: ");
    scanf("%d", &n);

    if (n < 1 || n > 10)
    {
        printf("Invalid size. Enter a value between 1 and 10.\n");
        return 1;
    }

    bottom = n - 1;
    right = n - 1;

    while (k < n * n)
    {
       
        for (j = left; j <= right; j++)
            a[top][j] = ++k;
        top++;

        
        for (i = top; i <= bottom; i++)
            a[i][right] = ++k;
        right--;

        
        for (j = right; j >= left; j--)
            a[bottom][j] = ++k;
        bottom--;

        
        for (i = bottom; i >= top; i--)
            a[i][left] = ++k;
        left++;
    }

    printf("\nThe spiral matrix is:\n");

    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
            printf("%d ", a[i][j]);

        printf("\n");
    }

    return 0;
}