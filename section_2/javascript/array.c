#include "stdio.h"

void printElement(int arr[], int index) {
  int element = arr[index];
  arr[index] = 42;
  printf("%i\n", element);
}

int main() {
  int arr[5] = {0, 0, 0, 0, 0};
  arr[0] = 7;
  printElement(arr, 1000000);
  return 0;
}
