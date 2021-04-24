package com.local.sorting.bubblesort;

import com.local.sorting.Sorting;

public class BubbleSortSimpleImplDescendingLeftToRight extends Sorting {

  public static void main(String[] args) {
    int[] array = {12, 64, -1, 3, 44, 21, 1, -11, -22};
    for (int i = 0; i < array.length - 1; i++) {
      System.out.println("Outer Loop : " + i);
      for (int j = 0; j < array.length - 1; j++) {
        System.out.println("Inner Loop : " + j);
        swap(array, j + 1, j);
      }
      System.out.println("Array after traversal " + i + " is : " + printArray(array));
    }
  }
}
