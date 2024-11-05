package com.myqr.kotlinsorting


public class CountSorting {
    /**
     *  정수를 오름차순으로 계수정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun countSortingIntUp(arr: ArrayList<Int>): ArrayList<Int> {
        if (arr.isEmpty()) return arr

        val max = arr.maxOrNull() ?: 0
        val min = arr.minOrNull() ?: 0
        val range = max - min + 1
        val count = IntArray(range) { 0 }
        val output = ArrayList<Int>(arr.size)

        // Count occurrences of each value
        for (num in arr) {
            count[num - min]++
        }

        // Reconstruct the sorted array
        for (i in count.indices) {
            repeat(count[i]) {
                output.add(i + min)
            }
        }

        return output
    }

    /**
     *  정수를 내림차순 계수정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun countSortingIntDown(arr: ArrayList<Int>): ArrayList<Int> {
        if (arr.isEmpty()) return arr

        val max = arr.maxOrNull() ?: 0
        val min = arr.minOrNull() ?: 0
        val range = max - min + 1
        val count = IntArray(range) { 0 }
        val output = ArrayList<Int>(arr.size)

        // Count occurrences of each value
        for (num in arr) {
            count[num - min]++
        }

        // Reconstruct the sorted array in descending order
        for (i in count.indices.reversed()) {
            repeat(count[i]) {
                output.add(i + min)
            }
        }

        return output
    }


}