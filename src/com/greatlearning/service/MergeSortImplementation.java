package com.greatlearning.service;

public class MergeSortImplementation {
	public void sort(int[] arr) {
		divideArray(arr, 0, arr.length - 1);
	}
	
	public void divideArray(int[] arr, int first, int last) {
		if (first < last) {
			int mid = (first + last) / 2;
			divideArray(arr, first, mid);
			divideArray(arr, mid + 1, last);
			conquerArray(arr, first, mid, last);
		}
	}

	public void conquerArray(int[] arr, int first, int mid, int last) {
		int leftArrayLength = mid - first + 1;
		int rightArrayLength = last - mid;
		int[] leftArray = new int[leftArrayLength];
		int[] rightArray = new int[rightArrayLength];

		for (int i = 0; i < leftArrayLength; i++) {
			leftArray[i] = arr[first + i];
		}

		for (int i = 0; i < rightArrayLength; i++) {
			rightArray[i] = arr[mid + 1 + i];
		}

		int i = 0;
		int j = 0;
		int k = first;

		while (i < leftArrayLength && j < rightArrayLength) {
			if (leftArray[i] >= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < leftArrayLength) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < rightArrayLength) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
}