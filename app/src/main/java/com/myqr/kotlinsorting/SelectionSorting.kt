package com.myqr.kotlinsorting

public class SelectionSorting {
    /**
     *  정수를 오름차순으로 선택정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun selectionSortingIntUp(arr :  ArrayList<Int>) :  ArrayList<Int> {
        var n = arr.size
        for (i in 0 until n){
            var min = arr[i]
            var index = i
            for (j in i+1 until  n ) {
                if (min > arr[j]) {
                    min = arr[j]
                    index = j
                }
                var temp = arr[i]
                arr[i] = arr[index]
                arr[index] = temp
            }
        }
        return arr
    }

    /**
     *  정수를 내림차순 선택정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun selectionSortingIntDown(arr :  ArrayList<Int>) :  ArrayList<Int> {
        var n = arr.size
        for (i in 0 until n){
            var max = arr[i]
            var index = i
            for (j in i+1 until  n ) {
                if (max < arr[j]) {
                    max = arr[j]
                    index = j
                }
                var temp = arr[i]
                arr[i] = arr[index]
                arr[index] = temp
            }
        }
        return arr
    }

}