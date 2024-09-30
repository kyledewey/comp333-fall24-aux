#include "stdio.h"

void printElement(int arr[], int index) {
  arr[0] = 5;

  // element is not of type int if index is out of bounds
  int element = arr[index];
  printf("%i\n", element);
}

void dummy(int x) {}

int main() {
  int a = 1;
  int b = 2;
  int c = 3;
  int d = 4;

  for (int index = 0; index < 4; index++) {
    printf("%i\n", *(&a + index));
  }
  printf("%p\n", &a);
  printf("%p\n", &b);
  printf("%p\n", &c);
  printf("%p\n", &d);
  
  int arr[5] = {0, 0, 0, 0, 0};
  printElement(arr, 10000000);
  return 0;
}
