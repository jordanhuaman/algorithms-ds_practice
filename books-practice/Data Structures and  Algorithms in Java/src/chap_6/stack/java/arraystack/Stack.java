package arraystack;
/**
 * A collection of objects that are inserted and removed according to the last-in first-out principle.
 * Although similar inpurpose, this interfacediffersfrom
 */
public interface Stack<E> {
  /**
   * Returns the number of elements in the stack.
   * @return
   */
  int size();
  /**
   * Tests whether the stack is empty.
   * @return
   */
  boolean isEmpty();

  /**
   * Inserts an element at the top of the stack.
   * @param e
   */
  void push(E e);

  /**
   * Returns, but does not remove, the element at the top of the stack.
   * @return
   */
  E top();
  /**
   * Removes and returns the element at the top of the stack.
   * @return
   */
  E pop();
}