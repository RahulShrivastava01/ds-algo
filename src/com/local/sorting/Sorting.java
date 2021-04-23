package com.local.sorting;

import java.util.StringJoiner;

public class Sorting {

  protected static String printArray(int[] array) {
    StringJoiner j = new StringJoiner(",");
    for (int a : array) {
      j.add(a + "");
    }
    return j.toString();
  }

  protected static void swap(int[] array, int i, int j) {
    if (array[i] == array[j]) {
      return;
    }
    if (array[i] > array[j]) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
    System.out.println("Array values after Inner loop traversal j : " + i + " are :" + array[i] + " and :" + array[j]);
  }


}
