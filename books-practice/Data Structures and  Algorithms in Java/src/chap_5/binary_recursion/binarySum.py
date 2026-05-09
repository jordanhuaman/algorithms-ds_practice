def binarySum(arr: list[int], low: int, high: int) -> int:
    if low > high:
        return 0
    elif low == high:
        return arr[low]
    else:
        mid = (low + high) // 2
        return binarySum(arr, low, mid) + binarySum(arr, mid + 1, high)