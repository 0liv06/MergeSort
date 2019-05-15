package org.olivier.practice.algorithm.sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {

    @Test
    public void pairElementsArrayMergeSortTest() {

        List<Integer> list = Collections.unmodifiableList(Arrays.asList(2, 1, 4, 99, 5, 7));
        List<Integer> sortedList = Collections.unmodifiableList(Arrays.asList(1, 2, 4, 5, 7, 99));

        MergeSort<Integer> mergeSort = new MergeSort<>(list);
        List<Integer> resultList = mergeSort.mergeSort();

        assertEquals(sortedList, resultList);
    }

    @Test
    public void emptyMergeSortTest() {

        List<Integer> list = Collections.emptyList();
        MergeSort<Integer> mergeSort = new MergeSort<>(list);
        List<Integer> resultList = mergeSort.mergeSort();

        assertEquals(list, resultList);
    }

    @Test
    public void oddElementsArrayMergeSortTest() {

        List<Integer> list = Collections.unmodifiableList(Arrays.asList(42, 2, 4, 9, 7, 99, 27));
        List<Integer> sortedList = Collections.unmodifiableList(Arrays.asList(2, 4, 7, 9, 27, 42, 99));

        MergeSort<Integer> mergeSort = new MergeSort<>(list);
        List<Integer> resultList = mergeSort.mergeSort();

        assertEquals(sortedList, resultList);
    }

    @Test
    public void alreadySortedArrayMergeSortTest() {

        List<Integer> list = Collections.unmodifiableList(Arrays.asList(1, 2, 4, 5, 7, 99));

        MergeSort<Integer> mergeSort = new MergeSort<>(list);
        List<Integer> resultList = mergeSort.mergeSort();

        assertEquals(list, resultList);
    }

    @Test
    public void duplicateNumbersArrayMergeSortTest() {

        List<Integer> list = Collections.unmodifiableList(Arrays.asList(55, 1, 102, 2, 4, 55, 7, 99));
        List<Integer> sortedList = Collections.unmodifiableList(Arrays.asList(1, 2, 4, 7, 55, 55, 99, 102));

        MergeSort<Integer> mergeSort = new MergeSort<>(list);
        List<Integer> resultList = mergeSort.mergeSort();

        assertEquals(sortedList, resultList);
    }
}
