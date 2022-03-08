package oop.fibonacci;

public class Fibonacci {
  int calculateFibonacci(int i) {
    int last = i;
    int current = calculateFibonacci(i);
    return current + last;
  }
}
