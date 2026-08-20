#include <stdio.h>

int main()
{
    int n = 5;
    int a[5][5];

    int top = 0, bottom = n - 1;
    int left = 0, right = n - 1;
    int num = 1;

    while (top <= bottom && left <= right)
    {
        
        for (int j = left; j <= right; j++)
            a[top][j] = num++;

        top++;

        
        for (int i = top; i <= bottom; i++)
            a[i][right] = num++;

        right--;

        
        for (int j = right; j >= left; j--)
            a[bottom][j] = num++;

        bottom--;

        
        for (int i = bottom; i >= top; i--)
            a[i][left] = num++;

        left++;
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
            printf("%2d ", a[i][j]);

        printf("\n");
    }

    return 0;
}