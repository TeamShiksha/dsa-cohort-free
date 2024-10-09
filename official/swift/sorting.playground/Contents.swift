import Foundation

// Bubble sort
func bubbleSort(arr: inout [Int]) {
    let count = arr.count
    for i in 0...count - 2 {
        var swapped = false
        for j in 0...(count - i - 2) {
            if arr[j] > arr[j+1] {
                let temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
                swapped = true
            }
        }
        if !swapped {
            break
        }
    }
}
var arr = [14,33,27,35,10]
bubbleSort(arr: &arr)
print(arr)

// Merge sort
func mergeSort(arr: inout [Int], start: Int, end: Int) {
    if start >= end {
        return
    }
    var mid = (start + end)/2
    mergeSort(arr: &arr, start: start, end: mid)
    mergeSort(arr: &arr, start: mid+1, end: end)
    merge(arr: &arr, start: start, end: end)
}

func merge(arr: inout [Int], start: Int, end: Int) {
    if start == end {
        return
    }
    var mid = (start + end)/2
    var i = start
    var j = mid + 1
    var k = 0
    
    var tempArr = Array(repeating: 0, count: end-start+1)
    
    while ( i <= mid && j <= end) {
        if arr[i] <= arr[j] {
            tempArr[k] = arr[i]
            i += 1
            k += 1
        } else {
            tempArr[k] = arr[j]
            j += 1
            k += 1
        }
    }
    
    while i <= mid {
        tempArr[k] = arr[i]
        i += 1
        k += 1
    }
    
    while j <= end {
        tempArr[k] = arr[j]
        j += 1
        k += 1
    }
    
    for i in start...end {
        arr[i] = tempArr[i-start]
    }
}

var arr1 = [14,33,27,35,10]
mergeSort(arr: &arr1, start: 0, end: arr.count-1)
print(arr1)
