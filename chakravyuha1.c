#include <stdio.h>

int main()
{
    int n = 4;

    for (int i = 0; i < 2 * n; i++)
    {
        for (int j = 0; j < 2 * n; j++)
        {
            int top = i;
            int left = j;
            int bottom = 2 * n - 1 - i;
            int right = 2 * n - 1 - j;

            int min = top;

            if (left < min)
                min = left;

            if (bottom < min)
                min = bottom;

            if (right < min)
                min = right;

            printf("%d", min + 1);
        }

        printf("\n");
    }

    return 0;
}