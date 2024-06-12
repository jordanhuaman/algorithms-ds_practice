#!/bin/py
#? En lugar de multiplicar el n, la operacion lo dejamos para el ultimo y lo acumulamos
def factorial_tail(n, acc=1):
    if n == 0:
        return acc
    else:
        return factorial_tail(n - 1, n * acc)
