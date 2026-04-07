def factorial(n: int) -> int:
    if n < 2:
        return n

    return n * factorial(n - 1)

result = factorial(3)
print(result)