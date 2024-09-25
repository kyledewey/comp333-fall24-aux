#include "stdio.h"

void printElement(int arr[], int index) {
  arr[0] = 5;

  // element is not of type int if index is out of bounds
  int element = arr[index];
  printf("%i\n", element);
}

int main() {
  int arr[5] = {0, 0, 0, 0, 0};
  printElement(arr, 100000);
  return 0;
}
