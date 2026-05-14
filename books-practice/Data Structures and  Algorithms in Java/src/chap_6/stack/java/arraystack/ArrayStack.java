package arraystack;
public class  ArrayStack<E> implements Stack<E> {
  public static final int CAPACITY = 1000; // default array capacity
  private E[] S; // generic array used for storage
  private int top = -1; // index of the top element in stack

  public ArrayStack() {
    this(CAPACITY);
  }

  @SuppressWarnings({ "unchecked" })
  public ArrayStack(int capacity) {
    S = (E[]) new Object[capacity]; // safe cast; compiler may give warning
  }

  @Override
  public int size() {
    return (top + 1);
  }

  @Override
  public boolean isEmpty() {
    return (top == -1);
  }

  /**
   * `top = top + 1;
   * S[top] = e;`
   */
  @Override
  public void push(E e) throws IllegalStateException {
    if (size() == S.length)
      throw new IllegalStateException("Stack is full");
    S[++top] = e; // increment top and then store new item
  }

  @Override
  public E top() {
    if (isEmpty())
      return null;
    return S[top];
  }

  @Override
  public E pop() {
    if (isEmpty())
      return null;
    E answer = S[top];
    S[top] = null; // dereference to help garbage collection
    top--;
    return answer;
  }
}