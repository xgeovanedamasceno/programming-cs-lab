package oop.capfour.thirteen;

public class Fibonacci {
  int calculateFibonacci(int i) {
    int last = i;
    int current = calculateFibonacci(i);
    return current + last;
  }
}
