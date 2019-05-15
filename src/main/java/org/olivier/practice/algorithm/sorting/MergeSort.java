package org.olivier.practice.algorithm.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Sorts the content of a given list using MergeSort algorithm
 *
 * @param <T>
 * @author Olivier Donnadei
 */
public class MergeSort<T extends Comparable<T>> {

    private List<T> inputList;

    public MergeSort(List<T> inputList) {
        this.inputList = inputList;
    }

    /**
     * Performs the merge sort on the inputList parameter passed in constructor
     *
     * @return the inputList sorted
     */
    List<T> mergeSort() {
        if (this.inputList == null || this.inputList.size() == 0) {
            return Collections.emptyList();
        }
        return performMergeSort(inputList);
    }

    /**
     * Split input list in 2 subLists of inputList.size / 2 and merge the 2 arrays by sorting elements together
     *
     * @param input inputList to be sorted
     * @return the sorted input list
     */
    private List<T> performMergeSort(List<T> input) {
        if (input.size() == 1) return input;

        List<T> chunk1 = input.subList(0, input.size() / 2);
        List<T> chunk2 = input.subList(input.size() / 2, input.size());

        List<T> chunk1Sorted = performMergeSort(chunk1);
        List<T> chunk2Sorted = performMergeSort(chunk2);
        return merge(chunk1Sorted, chunk2Sorted);

    }

    /**
     * Merge the 2 lists by comparing elements from each list. If one element is smaller than the other. Adds the smaller one and increments the pointer in the list
     *
     * @param chunk1 - first list of elements to be compared with chunks2
     * @param chunk2 - second list of elements to be compared with chunks1
     * @return the merged list of chunks1 and chunks2 sorted
     */
    private List<T> merge(List<T> chunk1, List<T> chunk2) {
        int c1Idx = 0;
        int c2Idx = 0;
        List<T> result = new ArrayList<>();

        while (c1Idx < chunk1.size() && c2Idx < chunk2.size()) {

            if (chunk1.get(c1Idx).compareTo(chunk2.get(c2Idx)) < 0) {
                result.add(chunk1.get(c1Idx));
                c1Idx++;
            } else {
                result.add(chunk2.get(c2Idx));
                c2Idx++;
            }
        }

        while (c1Idx < chunk1.size()) {
            result.add(chunk1.get(c1Idx));
            c1Idx++;
        }

        while (c2Idx < chunk2.size()) {
            result.add(chunk2.get(c2Idx));
            c2Idx++;
        }

        return result;
    }
}
