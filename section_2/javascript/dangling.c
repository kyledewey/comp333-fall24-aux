#include "stdio.h"

int* getPointer() {
  int p = 0;
  return &p;
}

void temp() {
  int x;
  printf("%i\n", x);
}

int main() {
  int* p = getPointer();
  *p = 42;
  printf("%i\n", *p);
  temp();
  
  return 0;
}
