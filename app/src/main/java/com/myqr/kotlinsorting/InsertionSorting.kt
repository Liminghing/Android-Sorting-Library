package com.myqr.kotlinsorting

public class InsertionSorting {
    /**
     *  정수를 오름차순으로 삽입정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun insertionSortingIntUp(arr :  ArrayList<Int>) :  ArrayList<Int> {
        var i = 0
        var j = 0
        var n = arr.size
        for (i in 1 until n){
            var key = arr[i]
            for (j in i-1 downTo 0 ){
                if(arr[j] > key){
                    arr[j+1] = arr[j]
                }else{
                    break
                }
            }
            arr[j+1] = key
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
        var i = 0
        var j = 0
        var n = arr.size
        for (i in n-2 downTo  0){
            var key = arr[i]
            for (j in i+1 until n ){
                if(arr[j] > key){
                    arr[j-1] = arr[j]
                }else{
                    break
                }
            }
            arr[j-1] = key
        }
        return arr
    }

}