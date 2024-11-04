package com.myqr.kotlinsorting


public class MergeSorting {
    /**
     *  정수를 오름차순으로 병합정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun mergeSortingIntUp(arr: ArrayList<Int>): ArrayList<Int> {
        if (arr.size <= 1) return arr

        val middle = arr.size / 2
        val left = ArrayList(arr.subList(0, middle))
        val right = ArrayList(arr.subList(middle, arr.size))

        return merge(mergeSortingIntUp(left), mergeSortingIntUp(right))
    }

    /**
     *  정수를 내림차순 병합정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun mergeSortingIntDown(arr: ArrayList<Int>): ArrayList<Int> {
        if (arr.size <= 1) return arr

        val middle = arr.size / 2
        val left = ArrayList(arr.subList(0, middle))
        val right = ArrayList(arr.subList(middle, arr.size))

        return mergeDesc(mergeSortingIntDown(left), mergeSortingIntDown(right))
    }


    private fun merge(left: ArrayList<Int>, right: ArrayList<Int>): ArrayList<Int> {
        var indexLeft = 0
        var indexRight = 0
        val newList = ArrayList<Int>()

        while (indexLeft < left.size && indexRight < right.size) {
            if (left[indexLeft] <= right[indexRight]) {
                newList.add(left[indexLeft])
                indexLeft++
            } else {
                newList.add(right[indexRight])
                indexRight++
            }
        }

        while (indexLeft < left.size) {
            newList.add(left[indexLeft])
            indexLeft++
        }

        while (indexRight < right.size) {
            newList.add(right[indexRight])
            indexRight++
        }

        return newList
    }


    private fun mergeDesc(left: ArrayList<Int>, right: ArrayList<Int>): ArrayList<Int> {
        var indexLeft = 0
        var indexRight = 0
        val newList = ArrayList<Int>()

        while (indexLeft < left.size && indexRight < right.size) {
            if (left[indexLeft] >= right[indexRight]) {
                newList.add(left[indexLeft])
                indexLeft++
            } else {
                newList.add(right[indexRight])
                indexRight++
            }
        }

        while (indexLeft < left.size) {
            newList.add(left[indexLeft])
            indexLeft++
        }

        while (indexRight < right.size) {
            newList.add(right[indexRight])
            indexRight++
        }

        return newList
    }


}