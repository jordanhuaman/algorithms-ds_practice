/**
 * Given [1,9,9,9] and [3,2,9]
 * Result [4,1,9,0,1]
 */
class ListNode3 {
  public value: number;
  public next: ListNode3 | null;

  constructor(value: number, next: ListNode3 | null) {
    this.value = value;
    this.next = next;
  }
}

const l1 = new ListNode3(1, new ListNode3(9, new ListNode3(9, new ListNode3(9, null))));
const l2 = new ListNode3(3, new ListNode3(2, new ListNode3(9, null)))

let test: ListNode3 | null = l1;

while (test !== null) {
  // console.log(test.value)
  test = test.next;
}

const result = (l1: ListNode3 | null, l2: ListNode3|null) => {
  let result = new ListNode3(0, null);
  let l3 = result;

  let carry = 0;


  while (l1 !== null || l2 !== null) {
    let sum = 0 + carry;
    if (l1 !== null) {
      sum = sum + l1.value;
      l1 = l1.next;
    }
    if (l2 !== null) {
      sum = sum + l2.value
      l2 = l2.next;
    }
    carry = Math.floor(sum / 10);
    l3.next = new ListNode3(sum % 10, null);
    l3 = l3.next;
  }
  if (carry === 1) l3.next = new ListNode3(1, null);
  return result.next;
}

const l4: ListNode3 | null = result(l1, l2);
let prm: ListNode3 | null = l4;
while (prm !== null) {
  console.log(prm.value)
  prm = prm.next;
}