
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

class ListNode2 {
  public value: number;
  public next: ListNode2 | null;

  constructor(value: number, next: ListNode2 | null) {
    this.value = value;
    this.next = next;
  }
}

const list1 = new ListNode2(2,null);
const list2 = new ListNode2(3,null);
const list3 = new ListNode2(4,null);
list1.next = list2;
list2.next = list3;

let ptr: ListNode2 | null = list1;

while (ptr !== null) {
  console.log(ptr.value);
  ptr = ptr.next;
}
console.log(Math.floor(9 / 10)); // 1
console.log(10 % 10);             // 5