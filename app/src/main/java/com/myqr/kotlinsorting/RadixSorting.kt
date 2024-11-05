package com.myqr.kotlinsorting


public class RadixSorting {
    fun getMax(arr: ArrayList<Int>): Int {
        var max = arr[0]
        for (i in 1 until arr.size) {
            if (arr[i] > max) max = arr[i]
        }
        return max
    }

    fun countingSort(arr: ArrayList<Int>, exp: Int) {
        val n = arr.size
        val output = ArrayList<Int>(n).apply { repeat(n) { add(0) } }
        val count = IntArray(10)

        // Count occurrences of each digit
        for (i in 0 until n) {
            val index = (arr[i] / exp) % 10
            count[index]++
        }

        // Update count array to hold positions of digits
        for (i in 1 until 10) count[i] += count[i - 1]

        // Build the output array
        for (i in n - 1 downTo 0) {
            val index = (arr[i] / exp) % 10
            output[count[index] - 1] = arr[i]
            count[index]--
        }

        // Copy sorted values back to arr
        for (i in 0 until n) arr[i] = output[i]
    }
    /**
     *  정수를 오름차순으로 기수정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun radixSortingIntUp(arr: ArrayList<Int>): ArrayList<Int> {
        val max = getMax(arr)

        // Apply counting sort for each digit
        var exp = 1
        while (max / exp > 0) {
            countingSort(arr, exp)
            exp *= 10
        }

        return arr
    }



    fun countingSortDescending(arr: ArrayList<Int>, exp: Int) {
        val n = arr.size
        val output = ArrayList<Int>(n).apply { repeat(n) { add(0) } }
        val count = IntArray(10)

        // Count occurrences of each digit
        for (i in 0 until n) {
            val index = (arr[i] / exp) % 10
            count[index]++
        }

        // Update count array for descending order
        for (i in 8 downTo 0) count[i] += count[i + 1]

        // Build the output array in descending order
        for (i in n - 1 downTo 0) {
            val index = (arr[i] / exp) % 10
            output[count[index] - 1] = arr[i]
            count[index]--
        }

        // Copy sorted values back to arr
        for (i in 0 until n) arr[i] = output[i]
    }
    /**
     *  정수를 내림차순 기수정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun radixSortingIntDown(arr: ArrayList<Int>): ArrayList<Int> {
        val max = getMax(arr)

        // Apply counting sort for each digit in descending order
        var exp = 1
        while (max / exp > 0) {
            countingSortDescending(arr, exp)
            exp *= 10
        }

        return arr
    }

}