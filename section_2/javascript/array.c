#include "stdio.h"

void printElement(int arr[], int index) {
  int element = arr[index];
  printf("%i\n", element);
}

int main() {
  int arr[5] = {0, 0, 0, 0, 0};
  printElement(arr, -10);
  return 0;
}
