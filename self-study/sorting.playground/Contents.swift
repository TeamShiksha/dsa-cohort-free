import Foundation

// Bubble sort
func bubbleSort(arr: inout [Int]) {
    let count = arr.count
    for i in 0...count - 2 {
        for j in 0...(count - i - 2) {
            if arr[j] >= arr[j+1] {
                let temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
            }
        }
    }
}
var arr = [14,33,27,35,10]
bubbleSort(arr: &arr)
print(arr)
