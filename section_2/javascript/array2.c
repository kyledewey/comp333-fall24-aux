#include <stdio.h>

int main() {
// decrementing by index int (4 bytes) from the initial variable results in access of adjacent memory addresses 
    int a = 10; // 0x16d733068
    int b = 20; // 0x16d733064
    int c = 30; // 0x16d733060

    for (int i = 0; i < 3; i++) {
        printf("%p %d\n", &a - i, *( &a - i));
    }
    printf("Memory address and value of variables\n");
    printf("%p %d\n", &a, a);
    printf("%p %d\n", &b, b);
    printf("%p %d\n", &c, c);

    return 0;
}
