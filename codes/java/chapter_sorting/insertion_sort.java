/*
 * File: insertion_sort.java
 * Created Time: 2022-11-25
 * Author: Krahets (krahets@163.com)
 */

package chapter_sorting;

import java.util.*;

public class insertion_sort {
    /* 插入排序 */
    static void insertionSort(int[] nums) {
        // 外循环：base = nums[1], nums[2], ..., nums[n-1]
        for (int i = 1; i < nums.length; i++) {
            int base = nums[i], j = i - 1;
            // 内循环：将 base 插入到左边的正确位置
            while (j >= 0 && nums[j] > base) {
                nums[j + 1] = nums[j];  // 1. 将 nums[j] 向右移动一位
                j--;
            }
            nums[j + 1] = base;         // 2. 将 base 赋值到正确位置
        }
    }

    public static void main(String[] args) {
        int[] nums = { 4, 1, 3, 1, 5, 2 };
        insertionSort(nums);
        System.out.println("排序后数组 nums = " + Arrays.toString(nums));
    }
}
