package com.myqr.kotlinsorting

public class InsertionSorting {
    /**
     *  정수를 오름차순으로 삽입정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun insertionSortingIntUp(arr :  ArrayList<Int>) :  ArrayList<Int> {
        var n = arr.size
        for (i in 1 until n){
            var key = arr[i]
            for (j in 0 until (i-1) ){
                if(arr[i] > key){
                    arr[j+1] = arr[j]
                }else{
                    break
                }
            }
            arr[i] = key
        }
        return arr
    }

    /**
     *  정수를 내림차순 삽입정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun insertionSortingIntDown(arr :  ArrayList<Int>) :  ArrayList<Int> {
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