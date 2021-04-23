package com.local.sorting.selectionsort;

public class SelectionSort {

  public static void main(String[] args) {
    int[] array = {12, 64, -1, 3, 44, 21, 1, -11, -22};

    for (int i = 1; i < array.length - 1; i++) {
      int largest = 0;

      for (int j = 1; j < array.length; j++) {
        if (array[largest] > array[j]) {
          largest = j;
        }
      }
      swap(array, i, largest);
    }

    for (int a : array) {
      System.out.println(a);
    }
  }

  private static void swap(int[] array, int i, int j) {
    if (array[i] == array[j]) {
      return;
    }
    if (array[i] > array[j]) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
  }

}
