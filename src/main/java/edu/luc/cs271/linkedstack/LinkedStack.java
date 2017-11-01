package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;
  private int size;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // TODO FINISHED
    top = new Node<>(obj, top);
    return obj;
  }

  @Override
  public E peek() {
    // TODO FINISHED
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
   return top.data;
  }

  @Override
  public E pop() {
    // TODO FINISHED
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    Node<E> store = top;
    top = top.next;
    return store.data;
  }

  @Override
  public boolean isEmpty() {
    // TODO FINISHED
    if (top == null) {
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public List<E> asList() {
    final ArrayList<E> result = new ArrayList<>(size);
    populateList(top, result); // TODO FINISHED replace null with the right reference
    return result;
  }

  private void populateList(final Node<E> curr, final List<E> result) {
    // TODO FINISHED recursively populate the list in the desired order
    if (curr == null) {
      return;
    }
    result.add(curr.data);
    populateList(curr.next, result);
  }

  @Override
  public List<E> asFifoList() {
    final ArrayList<E> result = new ArrayList<>(size);
    populateFifoList(top, result); // TODO FINISHED replace null with the right reference
    return result;
  }

  private void populateFifoList(final Node<E> curr, final List<E> result) {
    // TODO FINISHED recursively populate the list in the desired order
    if (curr == null) {
      return;
    }
    result.add(0, curr.data);
    populateFifoList(curr.next, result);
  }
}
