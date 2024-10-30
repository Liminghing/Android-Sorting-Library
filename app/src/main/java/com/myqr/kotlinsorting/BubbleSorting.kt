package com.myqr.kotlinsorting

public class BubbleSorting {
    /**
     *  정수를 오름차순으로 정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun bubbleSortingIntUp(arr :  ArrayList<Int>) :  ArrayList<Int> {
        var n = arr.size
        for (i in 0 until n){
            for (j in 0 until (n-1)){
                if(arr[j]>arr[j+1]){
                    var temp = arr[j]
                    arr[j] = arr[j+1]
                    arr[j+1] = temp
                }
            }
        }
        return arr
    }

    /**
     *  정수를 내림차순 정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun bubbleSortingIntDown(arr :  ArrayList<Int>) :  ArrayList<Int> {
        var n = arr.size
        for (i in 0 until n){
            for (j in 0 until (n-1)){
                if(arr[j]<arr[j+1]){
                    var temp = arr[j]
                    arr[j] = arr[j+1]
                    arr[j+1] = temp
                }
            }
        }
        return arr
    }

}