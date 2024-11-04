package com.myqr.kotlinsorting


public class QuickSorting {
    /**
     *  정수를 오름차순으로 퀵정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun quickSortingIntUp(arr: ArrayList<Int>): ArrayList<Int> {
        if (arr.size <= 1) return arr // 배열 크기가 1 이하이면 그대로 반환

        val pivot = arr[arr.size / 2] // 중간 값을 피벗으로 선택
        val left = ArrayList<Int>()
        val equal = ArrayList<Int>()
        val right = ArrayList<Int>()

        for (num in arr) {
            when {
                num < pivot -> left.add(num) // 피벗보다 작은 값은 left에 추가
                num == pivot -> equal.add(num) // 피벗과 같은 값은 equal에 추가
                else -> right.add(num) // 피벗보다 큰 값은 right에 추가
            }
        }

        // 재귀적으로 왼쪽, 오른쪽 정렬하고 합쳐서 반환
        return ArrayList<Int>().apply {
            addAll(quickSortingIntUp(left)) // 왼쪽 정렬된 부분 추가
            addAll(equal) // 피벗과 같은 값 추가
            addAll(quickSortingIntUp(right)) // 오른쪽 정렬된 부분 추가
        }
    }



    /**
     *  정수를 내림차순 퀵정렬하는 함수
     *
     *  @param arr  정렬하고자하는 ArrayList<Int>배열
     *  @return 정렬된 ArrayList<Int> 반환
     */
    public fun quickSortingIntDown(arr: ArrayList<Int>): ArrayList<Int> {
        if (arr.size <= 1) return arr // 배열 크기가 1 이하일 경우 그대로 반환

        val pivot = arr[arr.size / 2] // 중간 값을 피벗으로 선택
        val left = ArrayList<Int>()
        val equal = ArrayList<Int>()
        val right = ArrayList<Int>()

        for (num in arr) {
            when {
                num > pivot -> left.add(num) // 피벗보다 큰 값은 left에 추가
                num == pivot -> equal.add(num) // 피벗과 같은 값은 equal에 추가
                else -> right.add(num) // 피벗보다 작은 값은 right에 추가
            }
        }

        // 재귀적으로 왼쪽, 오른쪽 정렬하고 합쳐서 반환
        return ArrayList<Int>().apply {
            addAll(quickSortingIntDown(left)) // 왼쪽 정렬된 부분 추가 (큰 값)
            addAll(equal) // 피벗과 같은 값 추가
            addAll(quickSortingIntDown(right)) // 오른쪽 정렬된 부분 추가 (작은 값)
        }
    }


}