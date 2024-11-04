package com.myqr.kotlinsorting


public class ShellSorting {
    /**
     *  정수를 오름차순으로 쉘정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun shellSortingIntUp(arr: ArrayList<Int>): ArrayList<Int> {
        var n = arr.size
        var gap = n / 2

        while (gap > 0) {
            for (i in gap until n) {
                val temp = arr[i]
                var j = i
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap]
                    j -= gap
                }
                arr[j] = temp
            }
            gap /= 2
        }

        return arr
    }


    /**
     *  정수를 내림차순 쉘정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun shellSortingIntDown(arr: ArrayList<Int>): ArrayList<Int> {
        var n = arr.size
        var gap = n / 2

        while (gap > 0) {
            for (i in gap until n) {
                val temp = arr[i]
                var j = i
                while (j >= gap && arr[j - gap] < temp) {  // '<'로 변경하여 내림차순 정렬
                    arr[j] = arr[j - gap]
                    j -= gap
                }
                arr[j] = temp
            }
            gap /= 2
        }

        return arr
    }


}