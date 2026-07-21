## Info
- **patter** **nested-for-lopp option**
- In the most cases **O(n)**
- Pointer is simply a variable that represent an index or position within a data-structure suchas as **array** or **linked-list**.
- We an use pointer in diferent positions to compare elements.
- We an efficiently compare elements and make desicitions without relying on **nested-loop**.
### 1. Converging pointers
- Pointers started at opposite ends of a data structure. In List 0 and list.size and Linked list **head** and **tail**.
- Ideally when we need to compare elements at opposite ends of an **array** or **string**.
  - *Palindrome string problem*
### 2. Parallel Pointers
- Pointers start at the same end. One pointers start move forward and second one only move if the conditions require
- Example: We want to find the subarray with the long sum in [1,2-1,10,2,1,1] with max 3 items. [10,2,1]
- Goal: Finding arrays or substring with a specific criteria
- Sliding windows
### 3. Trigger-Based Pointers
- We move the first pointer independently until it finds an element that meet certain condition.
- After that we start traversing with the second pointer to find additional information related to what the first pointer found.
- Goal: Process elements in stages
- Example: finding the N node from the end of a linked list.
  - [1,2,3,4,5] N=2. Frist we move the first pointer at the second possition, and then we move the first and the second pointer together until the first node moved reaches the last node, and we will get the "N node from the end" in the second node.

### When to use a two pointer pattern.
- Linear Data Structure: {Array, String, Linked list}

### LeetCode Problems
- 283, 11 Container with most water

### References
- [Video](https://www.youtube.com/watch?v=QzZ7nmouLTI)