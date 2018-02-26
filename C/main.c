#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main()
{
    long g = 1;
    long h = 0;
    int s = 0;
    int l = 0;
    int j;
    printf("%d", INT_MAX);
    for(j = 0; j < 200; j++){

        h = g - h;
        g = g + h;

        if ( h > SHRT_MAX && s == 0){
            printf("Al calcular el Fibonacci(n) de n = %d se produce overflow en la variable de tipo int short.", (j+1));
            s = 1;
        }
        if( h < 0 && l == 0){
            printf("\nAl calcular el Fibonacci(n) de n = %d se produce overflow en la variable de tipo int long.", (j+1));
            l = 1;
            break;
        }
    }
}
