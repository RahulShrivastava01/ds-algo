package com.local.sorting.bubblesort;

import com.local.sorting.Sorting;

public class BubbleSortSimpleImplDescendingRightToLeft extends Sorting {

  public static void main(String[] args) {
    int[] array = {12, 64, -1, 3, 44, 21, 1, -11, -22};
    for (int i = array.length - 1; i > 0; i--) {
      System.out.println("Outer Loop : " + i);
      for (int j = array.length - 2; j >= 0; j--) {
        System.out.println("Inner Loop : " + j);
        swap(array, j + 1, j);
      }
      System.out.println("Array after traversal " + i + " is : " + printArray(array));
    }
  }

}
