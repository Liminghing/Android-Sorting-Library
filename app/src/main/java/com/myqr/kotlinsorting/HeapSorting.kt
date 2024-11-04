package com.myqr.kotlinsorting


public class HeapSorting {
    /**
     *  정수를 오름차순으로 힙정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun heapSortingIntUp(arr: ArrayList<Int>): ArrayList<Int> {
        var n = arr.size

        fun heapify(n: Int, i: Int) {
            var largest = i
            val l = 2 * i + 1
            val r = 2 * i + 2

            if (l < n && arr[l] > arr[largest]) largest = l
            if (r < n && arr[r] > arr[largest]) largest = r

            if (largest != i) {
                val swap = arr[i]
                arr[i] = arr[largest]
                arr[largest] = swap
                heapify(n, largest)
            }
        }

        for (i in n / 2 - 1 downTo 0) heapify(n, i)
        for (i in n - 1 downTo 0) {
            val temp = arr[0]
            arr[0] = arr[i]
            arr[i] = temp
            heapify(i, 0)
        }

        return arr
    }


    /**
     *  정수를 내림차순 힙정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun heapSortingIntDown(arr: ArrayList<Int>): ArrayList<Int> {
        var n = arr.size

        fun heapify(n: Int, i: Int) {
            var smallest = i
            val l = 2 * i + 1
            val r = 2 * i + 2

            if (l < n && arr[l] < arr[smallest]) smallest = l
            if (r < n && arr[r] < arr[smallest]) smallest = r

            if (smallest != i) {
                val swap = arr[i]
                arr[i] = arr[smallest]
                arr[smallest] = swap
                heapify(n, smallest)
            }
        }

        for (i in n / 2 - 1 downTo 0) heapify(n, i)
        for (i in n - 1 downTo 0) {
            val temp = arr[0]
            arr[0] = arr[i]
            arr[i] = temp
            heapify(i, 0)
        }

        return arr
    }


}