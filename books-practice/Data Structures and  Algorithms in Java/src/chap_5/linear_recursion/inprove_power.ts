const improve = (x: number, n: number): number => {
  if (n == 0) {
    console.log(n)
    return 1;
  } else {
    let partial = improve(x, Math.floor(n / 2));
    console.log("partial:", partial);

    let result = partial * partial;
    console.log(result)

    if (n % 2 == 1) {
      result *= x;
    }

    return result;
  }
}

improve(2,12);
// x = 2, n=4 -> 2*2*2*2 -> O(n), S(n)
// x = 2, n=8 -> 2⁴*2⁴ -> O(logn)
// n:2 -> 2 ; n:3 -> 3, n:4 -> 2, n:4 -> 3