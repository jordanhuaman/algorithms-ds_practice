### [The Euclidean Algorithm](https://www.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm)
MCD(A,B) = MCD(B,R)
Where:
- A = B*Q + R
Example:
- We have a area like this: 168*64
  1. 64*2 + 40 -> MCD(64,40) = 8
  2. We have a rest of **40**
  3. New Area 64*40 -> **recursive case**
  4. 40*1+24
  5. We have a rest of **24**
  6. New Area 40*24
  7. 24*1+16
  8. We have a rest of **16**
  9. New Area 24*16
  10. 16*1+8
  11. We have a rest of **8**
  12. New Area 16*8
  13. 8*2+0 **BASE CASE**
  14. Conslusion 168*64 = **8*8**