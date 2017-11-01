package edu.luc.cs271.linkedstack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseLines {

  public static void main(final String[] args) {
    System.out.println("Enter input, enter nothing to end.");
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }

  private static void printReverse(final Scanner input) {
    // TODO recursively read and print successive input lines until EOF, then print them out in reverse order
    String inputString = input.nextLine();
    Stack<String> backwards = new Stack<>();
    if (!inputString.equals(""))
    {
      backwards.push(inputString);
      System.out.println(inputString);
      printReverse(input);
    }
    else {
      return;
    }
    System.out.println(backwards.pop());
  }
}
