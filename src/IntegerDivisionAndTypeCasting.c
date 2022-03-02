#include <stdio.h>

int main() {
    double n;
    scanf("%lf",&n);

    // integer division filters fractions
    if ((n/2) == (int)(n/2))
        printf("even \n");
    else
        printf("odd \n");

    return 0;
}
