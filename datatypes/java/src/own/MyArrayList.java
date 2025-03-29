package datatypes.java.src.own;

import java.util.Arrays;

public class MyArrayList<E> {
  public static void main(String[] args) {
    System.out.println(3>>1);
  }
  private static final int DEFAULT_CAPACITY = 10;
  private Object[] elementData;
  private int size;

  public MyArrayList(){
    this.elementData = new Object[DEFAULT_CAPACITY];
  }

  public void add(E e){
    if (size==elementData.length) {
      grow();
    }
    elementData[size++]=e;
  }

  private void grow(){
    int newCapacity = elementData.length + (elementData.length>>1);
    elementData = Arrays.copyOf(elementData, newCapacity);
  }

  @SuppressWarnings("unchecked")
  public E get(int index){
    if (index<0 || index>=size) {
      throw new IndexOutOfBoundsException();
    }
    return (E) elementData[index];
  }

  public E remove(int index){
    E oldValue = get(index);
    int numMoved = size - index-1;
    if (numMoved>0) {
      System.arraycopy(elementData, index+1, elementData, index, numMoved);
    }
    elementData[--size] = null;
    return oldValue;
  }

  public int size(){
    return size;
  }
}
